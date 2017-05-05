package com.example.android.musicapp;

import android.os.Bundle;

public class ArtistActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        super.setSentence(getString(R.string.artistDesc));
    }
}
