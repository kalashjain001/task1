package com.example.task1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class grocery_list extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_list);

        String [] groceries = {"Milk","Yogurt","Cheese","Soups","Waffles","Ice Cream","Pasta","Brown Rice","Bread","Butter","Onion","Garlic","Fruits","Honey","Pepper","Salt","Maggie"};

        ListAdapter myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,groceries);
        ListView myListView = (ListView)findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        String grocery = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(grocery_list.this,grocery,Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }

}
