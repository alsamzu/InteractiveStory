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
    private ImageButton king;
    private ImageButton hunch;
    private ImageButton horse;
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
    king = findViewById(R.id.youngking);
    king.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openKing();
        }
    });
    hunch = findViewById(R.id.hunchback);
    hunch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openHunch();
        }
    });
    horse = findViewById(R.id.horse);
    horse.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openHorse();
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
    public void openKing(){
        Intent kingIntent = new Intent(this,Youngking.class);
        startActivity(kingIntent);
    }
    public void openHunch(){
        Intent hunchIntent = new Intent(this,Hunchback.class);
        startActivity(hunchIntent);
    }
    public void openHorse(){
        Intent horseIntent = new Intent(this,EnchantedHorse.class);
        startActivity(horseIntent);
    }

}
