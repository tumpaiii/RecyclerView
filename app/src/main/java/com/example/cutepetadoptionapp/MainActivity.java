package com.example.cutepetadoptionapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PetAdapter petAdapter;
    private List<Pet> petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        petList = new ArrayList<>();
        petList.add(new Pet("Bella", "A sweet and loving dog.", "Friendly, playful", R.drawable.img_1));
        petList.add(new Pet("Milo", "An energetic and curious cat.", "Adventurous, playful", R.drawable.img));
        petList.add(new Pet("Leo", "A cute baby cat.", "Beautiful, playful", R.drawable.img_3));
        petList.add(new Pet("Ruby", "A Playful and healthy Rabbit.", "Sweer, playful", R.drawable.img_4));

        petAdapter = new PetAdapter(petList);
        recyclerView.setAdapter(petAdapter);
    }
}
