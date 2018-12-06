package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoDogs extends AppCompatActivity {
            private Button dogsnext;
            private Button dogsmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dogs);
        dogsnext = findViewById(R.id.dogNext);
        dogsnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogsNextStory();
            }
        });

        dogsmain = findViewById(R.id.dogMainMenu);
        dogsmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogsmainMenu();
            }
        });
    }

    public void dogsNextStory(){
        Intent dogsintent = new Intent(this,Aladdin.class);
        startActivity(dogsintent);
    }

    public void dogsmainMenu(){
        Intent dogmain = new Intent(this,MainActivity.class);
        startActivity(dogmain);
    }
}
