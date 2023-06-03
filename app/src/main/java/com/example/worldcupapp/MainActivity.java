package com.example.worldcupapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static CustomAdapter adapter;
    ListView countriesList;
    ArrayList<CountryModel> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countriesList = findViewById(R.id.listView);

        dataModels = new ArrayList<CountryModel>();

        dataModels.add(new CountryModel("Brazil", 5, R.drawable.brazil));
        dataModels.add(new CountryModel("Germany", 4, R.drawable.germany));
        dataModels.add(new CountryModel("France", 2, R.drawable.france));
        dataModels.add(new CountryModel("Spain", 1, R.drawable.spain));
        dataModels.add(new CountryModel("England", 1, R.drawable.unitedkingdom));
        dataModels.add(new CountryModel("United States", 0, R.drawable.unitedstates));
        dataModels.add(new CountryModel("Saudi Arabia", 0, R.drawable.saudiarabia));

        adapter = new CustomAdapter(dataModels, getApplicationContext());
        countriesList.setAdapter(adapter);

        // handling click events on list view items
        countriesList.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(MainActivity.this, "Country: " + adapter.getItem(position).getCountryName() +
                    "\n" + "World Cup Wins: " + adapter.getItem(position).getCupWinCount(), Toast.LENGTH_SHORT).show();
        });
    }
}