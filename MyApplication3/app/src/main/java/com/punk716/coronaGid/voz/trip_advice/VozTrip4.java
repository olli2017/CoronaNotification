package com.punk716.coronaGid.voz.trip_advice;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.punk716.coronaGid.MyUtils;
import com.punk716.coronaGid.R;
import com.github.chrisbanes.photoview.PhotoView;

public class VozTrip4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voz_trip4);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView);
        photoView.setImageResource(R.drawable.voz_trip4);
        MyUtils.setsetSystemUiVisibility(this);
    }
}
