package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EnchantedHorse extends AppCompatActivity {
        private ImageButton horsemerchant;
        private ImageButton horsealadin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enchanted_horse);
        horsealadin = findViewById(R.id.horsealadin);
        horsealadin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaladin();
            }
        });
        horsemerchant = findViewById(R.id.horsemerchant);
        horsemerchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmerchant();
            }
        });
    }

    public void openaladin(){
        Intent openaladin = new Intent(this,Aladdin.class);
        startActivity(openaladin);

    }
    public void openmerchant(){
        Intent openmerchant = new Intent(this,Merchant.class);
        startActivity(openmerchant);
    }
}
