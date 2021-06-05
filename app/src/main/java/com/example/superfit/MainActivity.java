package com.example.superfit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        b4 =(Button)findViewById(R.id.recept);
    }
    public  void  onClick(View view){
        Intent intent = new Intent(MainActivity.this, recepptLIst.class);
        startActivity(intent);
    }
    public  void  onClick2(View view){
        Intent intent = new Intent(this, splashScren.class);
        startActivity(intent);
    }
    public  void  onClick3(View view){
        Intent intent = new Intent(this, Exercises.class);
        startActivity(intent);
    }





}