package com.example.asha.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    Handler handler =new Handler();
   handler.postDelayed(new Runnable(){

       @Override
       public void run() {
           startActivity(new Intent(splash.this,main.class));
       }
   },4000);
    }
}
