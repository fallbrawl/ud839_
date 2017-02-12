package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.words_list);

        final ArrayList<Word> words = new ArrayList<>();

//        words.add(new Word("wowo","wpwpw",R.drawable.color_black));
//        words.add(new Word("wowo","wpwpw",R.drawable.color_brown));
//        words.add(new Word("wowo","wpwpw",R.drawable.color_dusty_yellow));
//        words.add(new Word("wowo","wpwpw",R.drawable.color_gray));
//        words.add(new Word("wowo","wpwpw",R.drawable.color_gray));
//        words.add(new Word("wowo","wpwpw",R.drawable.color_mustard_yellow));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));
        words.add(new Word("wowo","wpwpw"));

        WordAdapter wordsNumbersAdapter = new WordAdapter(this, words, R.color.tan_background);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(wordsNumbersAdapter);
    }
}
