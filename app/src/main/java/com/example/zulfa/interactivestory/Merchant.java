package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Merchant extends AppCompatActivity {
    private ImageButton merchantaladin;
    private ImageButton merchantdogs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant);

        merchantaladin = findViewById(R.id.merchantaladin);
        merchantaladin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                merchantgoaladin();
            }
        });
        merchantdogs = findViewById(R.id.merchantdogs);
        merchantdogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                merchantgodogs();
            }
        });
    }
    public void merchantgoaladin(){
        Intent merchantmain = new Intent(this, Aladdin.class);
        startActivity(merchantmain);
    }
    public void merchantgodogs(){
        Intent merchantnext = new Intent(this,TwoDogs.class);
        startActivity(merchantnext);
    }
}
