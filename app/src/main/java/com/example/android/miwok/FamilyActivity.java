package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("wowo","wpwpw",R.drawable.family_daughter));
        words.add(new Word("wowo","wpwpw",R.drawable.family_father));
        words.add(new Word("wowo","wpwpw",R.drawable.family_grandmother));
        words.add(new Word("wowo","wpwpw",R.drawable.family_grandfather));
        words.add(new Word("wowo","wpwpw",R.drawable.family_son));
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
