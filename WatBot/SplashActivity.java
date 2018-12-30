package com.example.stephen.WatBot;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config  = new EasySplashScreen(SplashActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(2000) //sets time to 5 secs
                .withBackgroundColor(Color.parseColor("#ffffff"))
                .withLogo(R.drawable.image)
                .withFooterText("Copyright 2017")
                .withAfterLogoText("Developed By Stephen Blaney ");

        //Set text color;
        config.getFooterTextView().setTextColor(Color.BLACK);
        config.getAfterLogoTextView().setTextColor(Color.BLACK);


        //Set to view
        View view = config.create();

        //Set view to content view
        setContentView(view);
    }
}
