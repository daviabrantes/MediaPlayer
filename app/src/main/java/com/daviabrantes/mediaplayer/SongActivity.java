package com.daviabrantes.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        TextView txtSong = findViewById(R.id.txt_song_name);
        TextView txtArtist = findViewById(R.id.txt_artist_name);

        Bundle bundle = getIntent().getExtras();

        String songName = bundle.getString("songName");
        String artistName = bundle.getString("artistName");

        txtSong.setText(songName);
        txtArtist.setText(artistName);
    }
}
