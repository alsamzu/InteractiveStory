package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Hunchback extends AppCompatActivity {
    private ImageButton hunchorse;
    private ImageButton hunchmerchant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunchback);
        hunchorse = findViewById(R.id.hunchorse);
        hunchorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhorse();
            }
        });
        hunchmerchant = findViewById(R.id.hunchmerchant);
        hunchmerchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmerchant();
            }
        });
    }
    public void openhorse(){
        Intent openhorse = new Intent(this,EnchantedHorse.class);
        startActivity(openhorse);
    }
    public void openmerchant(){
        Intent openmerchant = new Intent(this,Merchant.class);
        startActivity(openmerchant);
    }
}
