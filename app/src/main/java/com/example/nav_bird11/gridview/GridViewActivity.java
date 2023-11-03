package com.example.nav_bird11.gridview;

import android.os.Bundle;
import android.widget.GridLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.nav_bird11.R;

public class GridViewActivity  extends AppCompatActivity {
    GridLayout gridLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

        gridLayout = findViewById(R.id.grid_layout);



    }




}
