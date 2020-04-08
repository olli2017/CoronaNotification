package com.example.myapplication3.voz.common_advice;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication3.MyUtils;
import com.example.myapplication3.R;
import com.github.chrisbanes.photoview.PhotoView;

public class VozCommon3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voz_common3);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView);
        photoView.setImageResource(R.drawable.voz_common3);
        MyUtils.setsetSystemUiVisibility(this);
    }
}
