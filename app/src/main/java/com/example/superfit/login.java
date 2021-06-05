package com.example.superfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {


    private EditText username;
    private Button login;
    private TextView loginloked;
    private TextView attempts;
    private TextView numberOFatempts;

    int nomberPopit=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        username =(EditText)findViewById(R.id.user_EDIT);
        login = (Button)findViewById(R.id.but_login);

    }
    public  void  login(View view){
        if(username.getText().toString().equals(" "));{
            Toast.makeText(getApplicationContext(), "нет данных",Toast.LENGTH_SHORT).show();
        }

        if(username.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(),"Вход выполнен", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( this,pasword.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "неправильные данные",Toast.LENGTH_SHORT).show();
    }

    }
    public  void  onClick2(View view){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}