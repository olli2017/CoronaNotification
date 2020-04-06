package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayOnlineStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_online_stats);

        int confirmed = 100;
        int deaths = 50;
        int recovered = 50;

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.confirmedTextView);
        textView.setText("Confirmed Cases: " + String.valueOf(confirmed));

        TextView textView2 = findViewById(R.id.deathTextView);
        textView2.setText("Deaths: " + String.valueOf(deaths));

        TextView textView3 = findViewById(R.id.recoveredTextView);
        textView3.setText("Recovered: " + String.valueOf(recovered));
    }
}
