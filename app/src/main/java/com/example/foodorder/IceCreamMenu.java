package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IceCreamMenu extends AppCompatActivity {

    Button bscotch,vennela,bcurran,berry;
    Button placeorder;
    String order="";

    Double price=0.00,tprice=0.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream_menu);
        bscotch=(Button) findViewById(R.id.bs);
        vennela=(Button) findViewById(R.id.v1);
        bcurran=(Button) findViewById(R.id.bc);
        berry=(Button) findViewById(R.id.sb);
        placeorder=(Button) findViewById(R.id.order3);
        bscotch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order=order+" "+"butter_scotch";
                price=price+50;
            }
        });
        vennela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order=order+" "+"vennela";
                price=price+50;
            }
        });
        bcurran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order=order+" "+"black_Curran";
                price=price+50;
            }
        });
        berry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order=order+" "+"StrawBerry";
                price=price+50;
            }
        });
        Intent i=getIntent();
        String o1=i.getStringExtra("o1");
        String o2=i.getStringExtra("o2");
        Double p1=i.getDoubleExtra("p1",0.00);
        Double p2=i.getDoubleExtra("p2",0.00);
        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IceCreamMenu.this,orderdetails.class);
                i.putExtra("or1",o1);
                i.putExtra("or2",o2);
                i.putExtra("or3",order);
                i.putExtra("pr1",p1);
                i.putExtra("pr2",p2);
                i.putExtra("pr3",price);
                startActivity(i);

            }
        });
    }
}