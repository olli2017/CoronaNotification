package com.example.myapplication3;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayNotificationSettings(View view) {
        Intent intent = new Intent(this, NotificationSettingsActivity.class);
        startActivity(intent);
    }

    public void displayInfoImage(View view) {
        Intent intent = new Intent(this, DisplayInfoActivity.class);
        startActivity(intent);
    }

    public void displayOnlineStats(View view) {
        Intent loaderIntent = new Intent(this, Loader.class);
        startActivity(loaderIntent);
        Intent displayOnlineStatsIntent = new Intent(this, DisplayOnlineStats.class);
        GetStats gs = new GetStats(displayOnlineStatsIntent);
        gs.execute();
    }

    class GetStats extends AsyncTask<Void, Void, Void> {
        public static final String WORLDOMETERS_CORONAVIRUS_URL = "https://www.worldometers.info/coronavirus/";
        public static final String ERROR_MSG = "Ошибка";

        String confirmed = ERROR_MSG;
        String deaths = ERROR_MSG;
        String recovered = ERROR_MSG;
        Intent statsIntent;

        GetStats(Intent intent) {
            statsIntent = intent;
        }

        @Override
        protected Void doInBackground(Void... params) {
            Document doc = null;
            try {
                doc = Jsoup.connect(WORLDOMETERS_CORONAVIRUS_URL).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String all_cases;
            if (doc != null) {
                all_cases = doc.select("#maincounter-wrap > div > span").text();
                String[] result = all_cases.split(" ");
                confirmed = result[0];
                deaths = result[1];
                recovered = result[2];
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            statsIntent.putExtra("CONFIRM_MESSAGE", confirmed);
            statsIntent.putExtra("DEATHS_MESSAGE", deaths);
            statsIntent.putExtra("RECOVERED_MESSAGE", recovered);
            startActivity(statsIntent);
        }


    }
}
