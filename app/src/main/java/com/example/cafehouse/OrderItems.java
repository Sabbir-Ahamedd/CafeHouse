package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderItems extends AppCompatActivity {

    TextView Coffe, Juice,Food, Ice ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_items);

       // Back Arrow Sign
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Coffe = findViewById(R.id.txtcoffe);
        Juice = findViewById(R.id.txtjuice);
        Food = findViewById(R.id.txtfood);
        Ice = findViewById(R.id.txtice);

        Coffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderItems.this,CoffeSide.class);
                startActivity(intent);
            }
        });

        Juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderItems.this,JuiceSide.class);
                startActivity(intent);
            }
        });

        Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderItems.this,FoodSide.class);
                startActivity(intent);
            }
        });

        Ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderItems.this,IceSide.class);
                startActivity(intent);
            }
        });



    }

    //Back Arrow working
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}