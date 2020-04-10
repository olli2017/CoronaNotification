package com.punk716.coronaGid.concreteAdvice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.punk716.coronaGid.R;
import com.punk716.coronaGid.voz.trip_advice.VozTrip1;
import com.punk716.coronaGid.voz.trip_advice.VozTrip2;
import com.punk716.coronaGid.voz.trip_advice.VozTrip3;
import com.punk716.coronaGid.voz.trip_advice.VozTrip4;

public class DisplayTripAdviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_info);
    }

    public void fullImageVozTrip1(View view) {
        Intent loaderIntent = new Intent(this, VozTrip1.class);
        startActivity(loaderIntent);
    }

    public void fullImageVozTrip2(View view) {
        Intent loaderIntent = new Intent(this, VozTrip2.class);
        startActivity(loaderIntent);
    }

    public void fullImageVozTrip3(View view) {
        Intent loaderIntent = new Intent(this, VozTrip3.class);
        startActivity(loaderIntent);
    }

    public void fullImageVozTrip4(View view) {
        Intent loaderIntent = new Intent(this, VozTrip4.class);
        startActivity(loaderIntent);
    }
}
