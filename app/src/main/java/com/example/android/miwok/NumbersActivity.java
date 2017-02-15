package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer = null;
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            Toast.makeText(NumbersActivity.this, "iM DONE!", Toast.LENGTH_LONG).show();
            Log.v("wow","wwww");
            releaseMediaPlayer();
        }
    };

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("wowo","wpwpw",R.drawable.number_eight, R.raw.color_black));
        words.add(new Word("wowo","wpwpw",R.drawable.number_five,R.raw.color_brown));
        words.add(new Word("wowo","wpwpw",R.drawable.number_four, R.raw.color_dusty_yellow));
//        words.add(new Word("wowo","wpwpw",R.drawable.number_nine));
//        words.add(new Word("wowo","wpwpw",R.drawable.number_six));
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


        WordAdapter wordsNumbersAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(wordsNumbersAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                Word neededWord = words.get(position);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, neededWord.getSoundId() );
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(onCompletionListener);

            }
        });



    }
}
