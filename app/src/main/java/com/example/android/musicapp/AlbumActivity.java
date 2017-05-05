package com.example.android.musicapp;

import android.os.Bundle;

public class AlbumActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        super.setSentence(getString(R.string.albumDesc));

    }
}
