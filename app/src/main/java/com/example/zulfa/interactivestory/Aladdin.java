package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Aladdin extends AppCompatActivity {
    private ImageButton aladindogs;
    private ImageButton aladinking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aladdin);
        aladindogs=findViewById(R.id.aladindogs);
        aladindogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                aladinextStory();
            }
        });
        aladinking =findViewById(R.id.aladinking);
        aladinking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aladinbackmain();
            }
        });
    }

    public void aladinextStory(){
        Intent aladinIntent = new Intent(this,TwoDogs.class);
        startActivity(aladinIntent);
    }
    public void aladinbackmain(){
        Intent aladinmain = new Intent(this,Youngking.class);
        startActivity(aladinmain);
    }
}
