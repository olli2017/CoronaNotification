package com.example.myapplication3.voz.trip_advice;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication3.MyUtils;
import com.example.myapplication3.R;
import com.github.chrisbanes.photoview.PhotoView;

public class VozTrip1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voz_trip1);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView);
        photoView.setImageResource(R.drawable.voz_trip1);
        MyUtils.setsetSystemUiVisibility(this);
    }
}
