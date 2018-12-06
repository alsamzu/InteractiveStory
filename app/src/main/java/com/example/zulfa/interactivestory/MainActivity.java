package com.example.zulfa.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
   private ImageButton aladin;
    private ImageButton merchant;
    private ImageButton twodogs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aladin=  findViewById(R.id.aladdin);
        aladin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAladdin();
            }
        });
        merchant = findViewById(R.id.merchantGenie);
        merchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMerchant();
            }
        });

        twodogs = findViewById(R.id.twodogs);
        twodogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDogs();
            }
        });


    }


    public void openAladdin(){
        Intent intent = new Intent(this,Aladdin.class);
        startActivity(intent);
    }
    public void openMerchant(){
        Intent merchantIntent = new Intent(this,Merchant.class);
        startActivity(merchantIntent);
    }
    public void openDogs(){
        Intent dogIntent = new Intent(this, TwoDogs.class);
        startActivity(dogIntent);
    }

}
