package com.example.spanglishdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddWordActivity extends AppCompatActivity {

    private TextView enterWordView, enterDefView, enterPalabraView, enterUseView;
    private EditText enterWordEdit, enterDefEdit, enterPalabraEdit, enterUseEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        // Initialize private TextView fields with their corresponding TextViews
        enterWordView = findViewById(R.id.enterWordView);
        enterDefView = findViewById(R.id.enterDefView);
        enterPalabraView = findViewById(R.id.enterPalabraView);
        enterUseView = findViewById(R.id.enterUseView);

        // Initialize private EditText fields with their corresponding EditTexts
        enterWordEdit = findViewById(R.id.enterWordEdit);
        enterDefEdit = findViewById(R.id.enterDefEdit);
        enterPalabraEdit = findViewById(R.id.enterPalabraEdit);
        enterUseEdit = findViewById(R.id.enterUseEdit);

        //


    }


    // Method to Send Data Items (new word info) to MainActivity here
    private void sendData() {
        Intent intent = new Intent(this, MainActivity.class);
        // Word data info below
    }


    // Method to store new Data (word info) here
    private void saveData() {
        Intent intent = new Intent(this, SavedWordsActivity.class);
        // Word data info below
    }
}