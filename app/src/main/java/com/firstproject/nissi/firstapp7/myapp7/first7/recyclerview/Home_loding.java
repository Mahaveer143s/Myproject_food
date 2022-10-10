package com.firstproject.nissi.firstapp7.myapp7.first7.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;

public class Home_loding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_loding);
        getSupportActionBar().hide();

        RecyclerView Fooditemview = findViewById(R.id.Fooditemlist);
        Fooditemview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Fooditem> apkitem = new ArrayList<>();
        Fooditem item = new Fooditem(R.drawable.burger,"Burger");
        apkitem.add(item);
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));
        apkitem.add(new Fooditem(R.drawable.burger,"Burger"));

        Recycler_itemAdabter Item_adabter = new Recycler_itemAdabter(this,apkitem);
        Fooditemview.setAdapter(Item_adabter);
    }
}