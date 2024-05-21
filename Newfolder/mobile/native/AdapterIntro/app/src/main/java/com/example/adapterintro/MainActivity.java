package com.example.adapterintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adapterView
        listView = findViewById(R.id.listview);

        //data source
        String[] countries = {"USA", "GERMANY", "SAUDI ARABIA", "FRANCE", "NIGERIA"};

        //adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        listView.setAdapter(adapter);
    }
}