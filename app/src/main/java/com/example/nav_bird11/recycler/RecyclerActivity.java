package com.example.nav_bird11.recycler;



import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nav_bird11.R;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    private Button button;

    ArrayList<BirdModel> arrName = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrName.add(new BirdModel(R.drawable.bat,"Night Birds"));
        arrName.add(new BirdModel(R.drawable.cock,"Cock"));
        arrName.add(new BirdModel(R.drawable.crow,"Crow"));
        arrName.add(new BirdModel(R.drawable.crane,"Crane"));

        RecyclerAdapter adapter = new RecyclerAdapter(this,arrName);

//        Button of home page to open list of birds


    }
}
