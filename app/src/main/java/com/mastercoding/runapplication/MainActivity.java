package com.mastercoding.runapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1- Data
    ArrayList<GameModel> arrayList;

    // 2- Adapter View
    RecyclerView recyclerView;

    // 3- Adapter
    myAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        arrayList = new ArrayList<>();
        arrayList.add(new GameModel("PUBG",R.drawable.pubg));
        arrayList.add(new GameModel("Temple Run",R.drawable.templerun));
        arrayList.add(new GameModel("Subway Surfers",R.drawable.subwaysuerfer));
        arrayList.add(new GameModel("KUBOOM",R.drawable.kuboom));
        arrayList.add(new GameModel("Dr. Driving",R.drawable.dr_driving));
        arrayList.add(new GameModel("Bike Racer",R.drawable.bikeracer));

        adapter = new myAdapter(this,arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


}