package com.example.inder.sampleapp;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int height = findViewById(R.id.row1).getHeight();
        int rowHeight = (int)Math.floor(height*0.25);

        LinearLayout textView = (LinearLayout) findViewById(R.id.row1);
        ViewGroup.LayoutParams params = textView.getLayoutParams();
        params.height = rowHeight;
        textView.setLayoutParams(params);
        //ImageView v=(ImageView) findViewById(R.id.randomp
    }
}
