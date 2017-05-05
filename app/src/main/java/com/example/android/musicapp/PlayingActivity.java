package com.example.android.musicapp;

import android.os.Bundle;
import android.widget.TextView;

public class PlayingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        TextView ArtistSong = (TextView) findViewById(R.id.ScrollSong);
        ArtistSong.setText(getString(R.string.artistName) + " - " + getString(R.string.songName));
        ArtistSong.setSelected(true);

        super.setSentence(getString(R.string.nowPlayingDesc));
    }
}
