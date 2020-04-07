package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication3.concreteAdvice.DisplayCommonAdviceActivity;
import com.example.myapplication3.concreteAdvice.DisplayTripAdviceActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);
    }

    public void openAdvice(View view) {
        Intent loaderIntent = new Intent(this, DisplayCommonAdviceActivity.class);
        startActivity(loaderIntent);
    }

    public void openTripInfo(View view) {
        Intent loaderIntent = new Intent(this, DisplayTripAdviceActivity.class);
        startActivity(loaderIntent);
    }
}
