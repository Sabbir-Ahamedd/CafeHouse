package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IceSide extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_side);

        //Title bar Name
        getSupportActionBar().setTitle("ICE-Creams");

        // Back Arrow Sign
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}