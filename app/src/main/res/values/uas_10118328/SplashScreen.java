package com.example.uas_10118328;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
/*      TANGGAL PENGERJAAN : JUMAT, 4 JUNI 2021
        NIM : 10118328
        NAMA : MUHAMMAD RAFI AVISINA
        KELAS : IF-8*/

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {

                Intent MainIntent =new Intent(SplashScreen.this, MainView.class);

                startActivity(MainIntent);
                finish();
            }

        }, 4000);

    }
}