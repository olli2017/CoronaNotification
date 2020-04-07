package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayAdviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice_info);
    }

    public void fullImageVoz1(View view) {
        Intent loaderIntent = new Intent(this, Voz1.class);
        startActivity(loaderIntent);
    }
    public void fullImageVoz2(View view) {
        Intent loaderIntent = new Intent(this, Voz2.class);
        startActivity(loaderIntent);
    }
    public void fullImageVoz3(View view) {
        Intent loaderIntent = new Intent(this, Voz3.class);
        startActivity(loaderIntent);
    }
    public void fullImageVoz4(View view) {
        Intent loaderIntent = new Intent(this, Voz4.class);
        startActivity(loaderIntent);
    }
}
