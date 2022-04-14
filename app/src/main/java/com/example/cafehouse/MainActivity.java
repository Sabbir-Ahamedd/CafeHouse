package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin, signup;
    TextView skip,About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Action bar code
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        getSupportActionBar().hide();

       signin = findViewById(R.id.btnLog);
       signup = findViewById(R.id.btnSignup);
       skip = findViewById(R.id.txtSkip);
        About = findViewById(R.id.txtAbt);

       signin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Toast.makeText(MainActivity.this, "SignIn has been clicked", Toast.LENGTH_LONG).show();

               Intent intent = new Intent(MainActivity.this,Login.class);
               startActivity(intent);

           }
       });

       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,SignUp.class);
               startActivity(intent);

               Toast.makeText(MainActivity.this, "SignUp has been clicked", Toast.LENGTH_LONG).show();
           }
       });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OrderItems.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Go to Menu Sector", Toast.LENGTH_LONG).show();
            }
        });

       About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Toast.makeText(MainActivity.this, "SignIn has been clicked", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,AboutUs.class);
                startActivity(intent);

            }
        });





        //end
    }
}