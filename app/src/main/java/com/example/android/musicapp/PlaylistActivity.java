package com.example.android.musicapp;

import android.os.Bundle;

public class PlaylistActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        super.setSentence(getString(R.string.playlistDesc));
    }
}
