package com.example.superfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Squats_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squats_screen);
        getSupportActionBar().hide();
    }
}