package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FoodSide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_side);

        //Title bar Name
        getSupportActionBar().setTitle("Food Items");

        // Back Arrow Sign
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}