package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by paul on 08.02.17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int colorId = -1;


    public WordAdapter(Activity context, ArrayList<Word> wordsAndroid, int colorId){
        super(context, 0, wordsAndroid);
        this.colorId = colorId;
        Log.v("color ", LOG_TAG  + " " + String.valueOf(colorId));
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwok_list_item);

        int color = ContextCompat.getColor(getContext(), colorId);

        miwokTextView.setBackgroundColor(color);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView translationTextView = (TextView) convertView.findViewById(R.id.translation_list_item);
        translationTextView.setText(currentWord.getDefaultTranslation());
        translationTextView.setBackgroundColor(color);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) convertView.findViewById(R.id.image_list_item);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentWord.hasImage()){
            iconView.setVisibility(View.VISIBLE);
            iconView.setImageResource(currentWord.getImageId());
        }
        else iconView.setVisibility(View.GONE);

        return convertView;
    }
}
