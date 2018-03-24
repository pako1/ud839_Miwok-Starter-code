package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    WordAdapter(Context context, ArrayList<Word> Words ,int mColorResourceId) {
        super(context,0,Words);
        this.mColorResourceId = mColorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        Word currentWord = getItem(position);

        View listItemview = convertView;

        if (listItemview == null) {
            //creating a view object if not created.
            listItemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView defaultTextView = listItemview.findViewById(R.id.default_text_view);
        if (currentWord != null) {
            defaultTextView.setText(currentWord.getmDefaultTranslation());
        }

        TextView mMiwokTextView = listItemview.findViewById(R.id.miwok_text_view);
        if (currentWord != null) {
            mMiwokTextView.setText(currentWord.getmMiwokTranslation());
        }

        ImageView imageView = listItemview.findViewById(R.id.image);
        if (currentWord != null) {
            if (currentWord.hasImage()) {
                imageView.setImageResource(currentWord.getImageID());
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }
        }

        View textContainer = listItemview.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemview;
    }

}
