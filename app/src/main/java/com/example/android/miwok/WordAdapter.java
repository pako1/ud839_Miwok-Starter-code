package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter( Context context, int resource,  ArrayList<Word> Words) {
        super(context, resource, Words);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        super.getView(position, convertView, parent);

        Word currentWord = getItem(position);

        View listItemview = convertView;

        if (listItemview==null){
            //creating a view object if not created.
            listItemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView defaultTextView = listItemview.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        TextView mMiwokTextView = listItemview.findViewById(R.id.miwok_text_view);
        mMiwokTextView.setText(currentWord.getmDefaultTranslation());



        return listItemview;
    }




}
