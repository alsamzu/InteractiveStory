package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Youngking extends AppCompatActivity {
    private ImageButton kinghunch;
    private ImageButton kinghorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youngking);

        kinghunch = findViewById(R.id.kinghunch);
        kinghunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhunch();
            }
        });

        kinghorse = findViewById(R.id.kinghorse);
        kinghorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhorse();
            }
        });
    }


    public void openhunch(){
        Intent openhunch = new Intent(this,Hunchback.class);
        startActivity(openhunch);
    }
    public void openhorse(){
        Intent openhorse = new Intent(this,EnchantedHorse.class);
        startActivity(openhorse);
    }
}
