package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;

public class Login extends AppCompatActivity {

    TextView account ;
    TextView Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Title bar Name
        getSupportActionBar().setTitle("Log In");

        //Back Arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        account = findViewById(R.id.txt1);
        Home = findViewById(R.id.txtcafe2);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();

    }
}