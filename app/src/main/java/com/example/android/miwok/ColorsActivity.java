package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlist);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("red", "weṭeṭṭi"));
        colors.add(new Word("mustard yellow", "chiwiiṭә"));
        colors.add(new Word("dusty yellow", "ṭopiisә"));
        colors.add(new Word("green", "chokokki"));
        colors.add(new Word("brown", "ṭakaakki"));
        colors.add(new Word("gray", "ṭopoppi"));
        colors.add(new Word("black", "kululli"));
        colors.add(new Word("white", "kelelli"));

        WordAdapter colorAdapter = new WordAdapter(this, 0, colors);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(colorAdapter);

    }
}
