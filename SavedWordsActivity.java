package com.example.spanglishdictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class SavedWordsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Words> wordsData;
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
        wordsData = new ArrayList<>();

        // Initialize adapter and set it to the recyclerview
        spanglishAdapter = new SpanglishAdapter(this, wordsData);
        recyclerView.setAdapter(spanglishAdapter);

        initializeData();
    }

    private void initializeData() {
        // Retrieve data items from XML array file
        String[] words = getResources().getStringArray(R.array.word_list);
        String[] definitions = getResources().getStringArray(R.array.def_list);
        String[] palabras = getResources().getStringArray(R.array.palabra_list);
        String[] uses = getResources().getStringArray(R.array.use_list);

        wordsData.clear();
    }


}