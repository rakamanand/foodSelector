package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinksMenu extends AppCompatActivity {
    Button cola, up, sting, sprite;
    Button placeorder;
    String orderd = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_menu);
        cola = (Button) findViewById(R.id.cola);
        up = (Button) findViewById(R.id.up1);
        sting = (Button) findViewById(R.id.sting);
        sprite = (Button) findViewById(R.id.sprite);
        placeorder = (Button) findViewById(R.id.order2);
        cola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderd = orderd  + " "+ "coco cola";
                price = price + 50;
            }
        });
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderd = orderd + " " + "7Up";
                price = price + 80;
            }
        });
        sting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderd = orderd + " "+ "sting" ;
                price = price + 20;
            }
        });
        sprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderd = orderd + " "+ "sprite" ;
                price = price + 60;
            }
        });
        Intent i=getIntent();
        String o1=i.getStringExtra("o1");
        Double p1=i.getDoubleExtra("p1",0.00);
        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DrinksMenu.this, IceCreamMenu.class);
                i.putExtra("o2",orderd);
                i.putExtra("p2",price);
                i.putExtra("o1",o1);
                i.putExtra("p1",p1);
                startActivity(i);

            }
        });
    }
}