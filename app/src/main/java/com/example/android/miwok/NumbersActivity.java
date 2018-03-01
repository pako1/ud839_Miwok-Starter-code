package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Word> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlist);

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));



        //ftiaxnw adapter analoga me ta dedomena poy 8elw na tou dwsw.
        // pernei san input mia lista gia to pws 8a ta emfanisei to context kai to arraylist poy exei to ti 8a emfanisei
        WordAdapter adapter = new WordAdapter(this,0,words);
        //ftiaxnoyme mia lista poy 8a emfanizei ta dedomena
        ListView listView = findViewById(R.id.list);
        //tis fortwnoyme ta dedomena apo ton adaptora pou 3erei pws na ta emfanisei
        listView.setAdapter(adapter);





    }
}
