package com.jomoflash.javatask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataItem> data;
    private CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.data = new ArrayList<DataItem>();
        this.data.add(new DataItem("Frozen Foods : \t" , "\u20a6  300"));
        this.data.add(new DataItem("Meat & Seafood \t", "\u20a6  250"));
        this.data.add(new DataItem("Cereals & Breakfast food\t", "\u20a6 100"));
        this.data.add(new DataItem("Pasta and Rice : \t" , "\u20a6  1400"));
        this.data.add(new DataItem("Frozen Foods : \t" , "\u20a6  700"));
        this.data.add(new DataItem("Soups & Canned Goods : \t" , "\u20a6  600"));
        this.data.add(new DataItem("Bakery and Bread : \t" , "\u20a6  3400"));
        this.data.add(new DataItem("Frozen Foods : \t" , "\u20a6  1200"));
        this.data.add(new DataItem("Meat & Seafood \t", "\u20a6  500"));
        this.data.add(new DataItem("Cereals & Breakfast food\t", "\u20a6 800"));
        this.data.add(new DataItem("Pasta and Rice : \t" , "\u20a6  1300"));
        this.data.add(new DataItem("Frozen Foods : \t" , "\u20a6  1240"));
        this.data.add(new DataItem("Soups & Canned Goods : \t" , "\u20a6  100"));
        this.data.add(new DataItem("Bakery and Bread : \t" , "\u20a6  300"));


        adapter = new CustomAdapter(data, this);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    public  void  nextPage(View view) {
        Intent intent = new Intent( this, profile.class);
        startActivity(intent);;
    }
}
