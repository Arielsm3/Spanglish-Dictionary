package com.example.spanglishdictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class SavedWordsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Words> wordsList;
    private SpanglishAdapter spanglishAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_words);

        /*
           * View saved entries.
           * Add entries.
         */
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize ArrayList that will contain the data
        wordsList = new ArrayList<>();

        // Initialize adapter and set it to the recyclerview
        spanglishAdapter = new SpanglishAdapter(this, wordsList);
        recyclerView.setAdapter(spanglishAdapter);

        initializeData();
    }

    private void initializeData() {
        // Retrieve data items from XML array file
        String[] wordsList = getResources().getStringArray(R.array.word_list);
        String[] defList = getResources().getStringArray(R.array.def_list);
        String[] palabrasList = getResources().getStringArray(R.array.palabra_list);
        String[] useList = getResources().getStringArray(R.array.use_list);
    }
}