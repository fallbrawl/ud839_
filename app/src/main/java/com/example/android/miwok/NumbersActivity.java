package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("wowo","wpwpw",R.drawable.number_eight));
        words.add(new Word("wowo","wpwpw",R.drawable.number_five));
        words.add(new Word("wowo","wpwpw",R.drawable.number_four));
        words.add(new Word("wowo","wpwpw",R.drawable.number_nine));
        words.add(new Word("wowo","wpwpw",R.drawable.number_six));
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
        words.add(new Word("wowo","wpwpw"));

        WordAdapter wordsNumbersAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(wordsNumbersAdapter);

    }
}
