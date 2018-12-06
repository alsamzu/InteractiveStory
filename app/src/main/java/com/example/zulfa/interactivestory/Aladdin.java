package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aladdin extends AppCompatActivity {
    private Button aladinext;
    private Button aladinmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aladdin);
        aladinext=findViewById(R.id.aladdinNext);
        aladinext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                aladinextStory();
            }
        });
        aladinmain=findViewById(R.id.aladdinMainMenu);
        aladinmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aladinbackmain();
            }
        });
    }

    public void aladinextStory(){
        Intent aladinIntent = new Intent(this,Merchant.class);
        startActivity(aladinIntent);
    }
    public void aladinbackmain(){
        Intent aladinmain = new Intent(this,MainActivity.class);
        startActivity(aladinmain);
    }
}
