package com.example.a15017484.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lvFood);

        //Create a few food objects in Food array
        food = new ArrayList<Food>();
        food.add(new Food(1, "Ah Lat Coffee", false));
        food.add(new Food(2, "Rocky Choc", true));
        food.add(new Food(3, "Kid Cat Choc", true));


        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new FoodAdapter(this, R.layout.row, food);
        lv.setAdapter(aa);

    }
}
