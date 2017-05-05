package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ArtistSong = (TextView) findViewById(R.id.ScrollSong);
        ArtistSong.setText(getString(R.string.artistName) + " - " + getString(R.string.songName));
        ArtistSong.setSelected(true);

        ImageView img = (ImageView) findViewById(R.id.expend);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(intent);
            }
        });

        text = (TextView) findViewById(R.id.playlist);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });

        text = (TextView) findViewById(R.id.artist);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(intent);
            }
        });

        text = (TextView) findViewById(R.id.album);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });

        text = (TextView) findViewById(R.id.song);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongActivity.class);
                startActivity(intent);
            }
        });

        super.setSentence(getString(R.string.mainDesc));

    }

}
