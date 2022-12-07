package com.example.spanglishdictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddWordActivity extends AppCompatActivity {

    private ArrayList<Words> wordsData;

    private TextView enterWordView, enterDefView, enterPalabraView, enterUseView;
    private EditText enterWordEdit, enterDefEdit, enterPalabraEdit, enterUseEdit;

    protected static final String KEY_EXTRA_MESSAGE = "com.example.spanglishdictionary.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        // Initialize array list that will contain words data
        wordsData = new ArrayList<>();

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

        // Add new data to ArrayList Words method call
        addNewData();

    }

    private String addNewWord() {
        return enterWordEdit.getText().toString();
    }

    private String addNewDef() {
        return enterDefEdit.getText().toString();
    }

    private String addNewPalabra() {
        return enterPalabraEdit.getText().toString();
    }

    private String addNewUse() {
        return enterUseEdit.getText().toString();
    }

    private void addNewData() {
        wordsData.add( new Words(
                addNewWord(),
                addNewDef(),
                addNewPalabra(),
                addNewUse()
        ));
    }

    public void addNewWordToList(View view) { // Send new word data to SavedWordsActivity
        Intent intent = new Intent(this, SavedWordsActivity.class);
        intent.putExtra(KEY_EXTRA_MESSAGE, wordsData);
    }

    public void clearData(View view) {
        enterWordEdit.getText().clear();
        enterDefEdit.getText().clear();
        enterPalabraEdit.getText().clear();
        enterUseEdit.getText().clear();
    }
}