package com.example.ahmetfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
    }
    public void register(View view)
    {
        startActivity(new Intent(WelcomeActivity.this,RegistrationActivity2.class));
    }
    public void login(View view){
        startActivity(new Intent(WelcomeActivity.this, LoginActivity.class ));
    }
}