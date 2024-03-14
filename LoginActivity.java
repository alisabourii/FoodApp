package com.example.ahmetfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void SingIn(View view){

    }
    public void register(View view){
        startActivity(new Intent(LoginActivity.this,RegistrationActivity2.class));
    }
}