package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class orderdetails extends AppCompatActivity {
    TextView orders1,orders2,orders3,price1,price2,price3,price4;
    String listorders1,listorders2,listorders3;
    Double p1,p2,p3,totalprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetails);
        orders1=(TextView) findViewById(R.id.textView);
        orders2=(TextView) findViewById(R.id.textView2);
        orders3=(TextView) findViewById(R.id.textView3);
        price1=(TextView) findViewById(R.id.priceview1);
        price2=(TextView) findViewById(R.id.priceview2);
        price3=(TextView) findViewById(R.id.priceview3);
        price4=(TextView)findViewById(R.id.totalview);
        Intent bundle=getIntent();
        listorders1=bundle.getStringExtra("or1");
        listorders2=bundle.getStringExtra("or2");
        listorders3=bundle.getStringExtra("or3");
        p1=bundle.getDoubleExtra("pr1",0.00);
        p2=bundle.getDoubleExtra("pr2",0.00);
        p3=bundle.getDoubleExtra("pr3",0.00);
        totalprice=p1+p2+p3;
        orders1.setText(listorders1);
        price1.setText("Food price:"+p1.toString());
        orders2.setText(listorders2);
        price2.setText("Drinks price:"+p2.toString());
        orders3.setText(listorders3);
        price3.setText("IceCreams price:"+p3.toString());
        price4.setText("Total price:"+totalprice.toString());
    }
}