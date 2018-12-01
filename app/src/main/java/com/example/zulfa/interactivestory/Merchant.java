package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Merchant extends AppCompatActivity {
    private Button merchantmain;
    private Button merchantnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant);

        merchantmain = findViewById(R.id.merchantMain);
        merchantmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                merchantbackmain();
            }
        });
        merchantmain = findViewById(R.id.merchantNext);
        merchantmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                merchantnextstory();
            }
        });
    }
    public void merchantbackmain(){
        Intent merchantmain = new Intent(this, MainActivity.class);
        startActivity(merchantmain);
    }
    public void merchantnextstory(){
        Intent merchantnext = new Intent(this,Aladdin.class);
        startActivity(merchantnext);
    }
}
