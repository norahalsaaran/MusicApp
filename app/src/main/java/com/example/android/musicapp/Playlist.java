package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        LinearLayout album = (LinearLayout) findViewById(R.id.album) ;
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album = new Intent(Playlist.this, Album.class);
                startActivity(album);
            }
        });
        LinearLayout allSong = (LinearLayout) findViewById(R.id.allSong) ;
        allSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSong = new Intent(Playlist.this, Allsong.class);
                startActivity(allSong);
            }
        });
        LinearLayout artist = (LinearLayout) findViewById(R.id.artist) ;
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artist = new Intent(Playlist.this, Artist.class);
                startActivity(artist);
            }
        });
        LinearLayout home = (LinearLayout) findViewById(R.id.home) ;
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent home = new Intent(Playlist.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}
