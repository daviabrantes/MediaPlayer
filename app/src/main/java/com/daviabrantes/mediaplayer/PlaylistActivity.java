package com.daviabrantes.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.daviabrantes.mediaplayer.model.Song;

import java.util.ArrayList;

import adapter.SongAdapter;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("My Curse", "Killswitch Engage"));
        songs.add(new Song("Broken Hands", "Lamb of God"));
        songs.add(new Song("Rain", "Trivium"));
        songs.add(new Song("My Questions", "The Devil Wears Prada"));
        songs.add(new Song("Live In Love", "Times of Grace"));
        songs.add(new Song("Obzen", "Meshuggah"));
        songs.add(new Song("C.A.N.C.E.R.", "Architects"));
        songs.add(new Song("There Is Nothing Left", "All Shall Perish"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song selectedSong = (Song) listView.getAdapter().getItem(i);
                String songName = selectedSong.getSong();
                String artistName = selectedSong.getArtist();
                Intent intent = new Intent(PlaylistActivity.this, SongActivity.class);
                intent.putExtra("songName", songName);
                intent.putExtra("artistName", artistName);
                startActivity(intent);
            }
        });
    }
    }
