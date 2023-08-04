package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodMenu extends AppCompatActivity {

    Button biryani,burger,pizza,pasta;
    Button placeorder;
    String orderf="";
    Double price=0.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        biryani=(Button) findViewById(R.id.biryani);
        pizza=(Button) findViewById(R.id.pizza);
        burger=(Button) findViewById(R.id.burger);
        pasta=(Button) findViewById(R.id.pasta);
        placeorder=(Button) findViewById(R.id.order);
        biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderf=orderf+" "+"biryani";
                price=price+500;
            }
        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderf=orderf+" "+"pizza";
                price=price+200;
            }
        });
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderf=orderf+" "+"burger";
                price=price+250;
            }
        });
        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderf=orderf+" "+"pasta";
                price=price+150;
            }
        });
        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FoodMenu.this,DrinksMenu.class);
                i.putExtra("o1",orderf);
                i.putExtra("p1",price);
                startActivity(i);

            }
        });
    }
}