package com.example.myapplication3.concreteAdvice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication3.MyUtils;
import com.example.myapplication3.R;
import com.github.chrisbanes.photoview.PhotoView;

public class DisplaySymptomsAdviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_symptoms_advice);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView);
        photoView.setImageResource(R.drawable.symptoms);
        MyUtils.setsetSystemUiVisibility(this);
    }
}
