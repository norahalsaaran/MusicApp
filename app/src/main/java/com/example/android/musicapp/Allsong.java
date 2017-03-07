package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Allsong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allsong);
        LinearLayout album = (LinearLayout) findViewById(R.id.album) ;
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent album = new Intent(Allsong.this, Album.class);
                startActivity(album);
            }
        });
        LinearLayout artist = (LinearLayout) findViewById(R.id.artist) ;
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artist = new Intent(Allsong.this, Artist.class);
                startActivity(artist);
            }
        });
        LinearLayout playlist = (LinearLayout) findViewById(R.id.playlist) ;
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist = new Intent(Allsong.this, Playlist.class);
                startActivity(playlist);
            }
        });
        LinearLayout home = (LinearLayout) findViewById(R.id.home) ;
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent home = new Intent(Allsong.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}
