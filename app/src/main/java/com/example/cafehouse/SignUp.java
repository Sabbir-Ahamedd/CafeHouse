package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    Button Reg ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Title bar Name
        getSupportActionBar().setTitle("Sign UP");

        //Back Arrow show
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Reg = findViewById(R.id.btnReg);

    }



    //Back Arrow working
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}