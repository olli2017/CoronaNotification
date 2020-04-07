package com.example.myapplication3;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);
    }

    public void fullImageVoz1(View view) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.imageButton);

    }
}
