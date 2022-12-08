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

    private String stringWord, stringDef, stringPalabra, stringUse;

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
        enterWordEdit = (EditText) findViewById(R.id.enterWordEdit);
        enterDefEdit = (EditText) findViewById(R.id.enterDefEdit);
        enterPalabraEdit = (EditText) findViewById(R.id.enterPalabraEdit);
        enterUseEdit = (EditText) findViewById(R.id.enterUseEdit);

        // Add text strings to TextViews
        loadTextViews();

        // Add new data to ArrayList Words method call
        addNewData();

    }

    private void loadTextViews() {
        String enterWord = getString(R.string.enter_word);
        String enterDef = getString(R.string.enter_definition);
        String enterPalabra = getString(R.string.enter_translation);
        String enterUse = getString(R.string.enter_use);

        enterWordView.setText(enterWord);
        enterDefView.setText(enterDef);
        enterPalabraView.setText(enterPalabra);
        enterUseView.setText(enterUse);
    }

    private void addNewData() {
        stringWord = enterWordEdit.getText().toString();
        stringDef = enterDefEdit.getText().toString();
        stringPalabra = enterPalabraEdit.getText().toString();
        stringUse = enterUseEdit.getText().toString();

        wordsData.add( new Words(stringWord, stringDef, stringPalabra, stringUse));
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