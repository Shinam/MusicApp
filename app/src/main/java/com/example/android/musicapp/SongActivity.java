package com.example.android.musicapp;

import android.os.Bundle;

public class SongActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        super.setSentence(getString(R.string.songDesc));
    }
}
