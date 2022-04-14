package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class JuiceSide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice_side);

        //Title bar Name
        getSupportActionBar().setTitle("Juice Items");

        // Back Arrow Sign
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}