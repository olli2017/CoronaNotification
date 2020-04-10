package com.punk716.coronaGid.concreteAdvice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.punk716.coronaGid.R;
import com.punk716.coronaGid.voz.common_advice.VozCommon1;
import com.punk716.coronaGid.voz.common_advice.VozCommon2;
import com.punk716.coronaGid.voz.common_advice.VozCommon3;
import com.punk716.coronaGid.voz.common_advice.VozCommon4;

public class DisplayCommonAdviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice_info);
    }

    public void fullImageVozCommon1(View view) {
        Intent loaderIntent = new Intent(this, VozCommon1.class);
        startActivity(loaderIntent);
    }

    public void fullImageVozCommon2(View view) {
        Intent loaderIntent = new Intent(this, VozCommon2.class);
        startActivity(loaderIntent);
    }

    public void fullImageVozCommon3(View view) {
        Intent loaderIntent = new Intent(this, VozCommon3.class);
        startActivity(loaderIntent);
    }

    public void fullImageVozCommon4(View view) {
        Intent loaderIntent = new Intent(this, VozCommon4.class);
        startActivity(loaderIntent);
    }
}
