package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TwoDogs extends AppCompatActivity {
            private ImageButton dogsking;
            private ImageButton dogshunch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dogs);
        dogsking = findViewById(R.id.dogsking);
        dogsking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogsNextStory();
            }
        });

        dogshunch = findViewById(R.id.doghunch);
        dogshunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogsmainMenu();
            }
        });
    }

    public void dogsNextStory(){
        Intent dogsintent = new Intent(this,Youngking.class);
        startActivity(dogsintent);
    }

    public void dogsmainMenu(){
        Intent dogmain = new Intent(this,Hunchback.class);
        startActivity(dogmain);
    }
}
