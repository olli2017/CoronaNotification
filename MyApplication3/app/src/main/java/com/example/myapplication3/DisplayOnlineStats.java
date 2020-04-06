package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class DisplayOnlineStats extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_online_stats);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.confirmedTextView);
        TextView textView2 = findViewById(R.id.deathTextView);
        TextView textView3 = findViewById(R.id.recoveredTextView);
        Intent intent = getIntent();
        String confirmed = intent.getStringExtra("CONFIRM_MESSAGE");
        String deaths = intent.getStringExtra("DEATHS_MESSAGE");
        String recovered = intent.getStringExtra("RECOVERED_MESSAGE");

        textView.setText("Confirmed Cases: " + confirmed);
        textView2.setText("Deaths: " + deaths);
        textView3.setText("Recovered: " + recovered);
    }
}
