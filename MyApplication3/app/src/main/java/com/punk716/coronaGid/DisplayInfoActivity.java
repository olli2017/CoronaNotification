package com.punk716.coronaGid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.punk716.coronaGid.concreteAdvice.DisplayCommonAdviceActivity;
import com.punk716.coronaGid.concreteAdvice.DisplayInfectionAdviceActivity;
import com.punk716.coronaGid.concreteAdvice.DisplaySymptomsAdviceActivity;
import com.punk716.coronaGid.concreteAdvice.DisplayTripAdviceActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);
    }

    public void openCommonAdvice(View view) {
        Intent loaderIntent = new Intent(this, DisplayCommonAdviceActivity.class);
        startActivity(loaderIntent);
    }

    public void openTripAdvice(View view) {
        Intent loaderIntent = new Intent(this, DisplayTripAdviceActivity.class);
        startActivity(loaderIntent);
    }

    public void openInfectionAdvice(View view) {
        Intent loaderIntent = new Intent(this, DisplayInfectionAdviceActivity.class);
        startActivity(loaderIntent);
    }

    public void openSymptomsAdvice(View view) {
        Intent loaderIntent = new Intent(this, DisplaySymptomsAdviceActivity.class);
        startActivity(loaderIntent);
    }
}
