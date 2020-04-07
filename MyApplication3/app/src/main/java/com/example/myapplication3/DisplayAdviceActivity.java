package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication3.voz.common_advice.Voz1;
import com.example.myapplication3.voz.common_advice.Voz2;
import com.example.myapplication3.voz.common_advice.Voz3;
import com.example.myapplication3.voz.common_advice.Voz4;

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
