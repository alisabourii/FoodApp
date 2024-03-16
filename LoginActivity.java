package com.example.ahmetfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void SingIn(View view){
        EditText edt1 = findViewById(R.id.editTextTextPersonName2);
        EditText edt2 = findViewById(R.id.editTextTextPersonName3);
        String mailAdress = edt1.getText().toString();
        String passWord = edt2.getText().toString();

        ArrayList<String> UsersMailAdress = new ArrayList<String>();
        UsersMailAdress.add("alisabouri516@gmail.com");

        ArrayList<String> UsersPassWords = new ArrayList<String>();
        UsersPassWords.add("a1234");


        if(UsersMailAdress.contains(mailAdress) && UsersMailAdress.contains(passWord)){
            if(UsersMailAdress.indexOf(mailAdress) == UsersPassWords.indexOf(passWord)){
                startActivity(new Intent(LoginActivity.this,FoodPanel.class));
            }
        }


    }
    public void register(View view){
        startActivity(new Intent(LoginActivity.this,RegistrationActivity2.class));
    }
}