package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        textView.setText("Заражений:\n" + confirmed);
        textView2.setText("Смертей:\n" + deaths);
        textView3.setText("Выздоровлений:\n" + recovered);
    }
}
