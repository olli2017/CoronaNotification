package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

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
        Intent first = new Intent(this, Loader.class);
        startActivity(first);
        Intent intent = new Intent(this, DisplayOnlineStats.class);
        GetStats gs = new GetStats(intent);
        gs.execute();
    }
    class GetStats extends AsyncTask<Void, Void, Void> {
        String confirmed;
        String deaths;
        String recovered;
        Intent intent;

        GetStats(Intent intent1) {
            intent = intent1;
        }

        @Override
        protected Void doInBackground(Void... params){
            Document doc = null;
            try {
                doc = Jsoup.connect("https://www.worldometers.info/coronavirus/").get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String all_cases;
            if (doc!=null) {
                all_cases = doc.select("#maincounter-wrap > div > span").text();
                String[] result = all_cases.split(" ");
                confirmed = result[0];
                deaths = result[1];
                recovered = result[2];
            }
            else {
                confirmed = "Ошибка";
                deaths = "Ошибка";
                recovered = "Ошибка";
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            intent.putExtra("CONFIRM_MESSAGE", confirmed);
            intent.putExtra("DEATHS_MESSAGE", deaths);
            intent.putExtra("RECOVERED_MESSAGE", recovered);
            startActivity(intent);
        }


    }
}
