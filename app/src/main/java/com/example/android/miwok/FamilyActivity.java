package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlist);

        ArrayList<Word> family = new ArrayList<>();

        family.add(new Word("father", "әpә"));
        family.add(new Word("mother", "әṭa"));
        family.add(new Word("son", "angsi"));
        family.add(new Word("daughter", "tune"));
        family.add(new Word("older brother", "taachi"));
        family.add(new Word("younger brother", "chalitti"));
        family.add(new Word("older sister", "teṭe"));
        family.add(new Word("younger sister", "kolliti"));
        family.add(new Word("grandmother ", "ama"));
        family.add(new Word("grandfather", "paapa"));

        WordAdapter colorAdapter = new WordAdapter(this, 0, family);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(colorAdapter);


    }
}