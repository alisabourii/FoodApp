package com.example.ahmetfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration2);
    }
    public void register(View view){

    }
    public void login(View view){
        startActivity(new Intent(RegistrationActivity2.this, LoginActivity.class ));
    }
}