package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        LinearLayout allSong = (LinearLayout) findViewById(R.id.allSong) ;
        allSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSong = new Intent(Album.this, Allsong.class);
                startActivity(allSong);
            }
        });
        LinearLayout artist = (LinearLayout) findViewById(R.id.artist) ;
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artist = new Intent(Album.this, Artist.class);
                startActivity(artist);
            }
        });
        LinearLayout playlist = (LinearLayout) findViewById(R.id.playlist) ;
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist = new Intent(Album.this, Playlist.class);
                startActivity(playlist);
            }
        });
        LinearLayout home = (LinearLayout) findViewById(R.id.home) ;
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent home = new Intent(Album.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}
