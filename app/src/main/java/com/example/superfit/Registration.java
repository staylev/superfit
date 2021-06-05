package com.example.superfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();
    }
    public  void  onClick(View view){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
    public  void  onClick2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}