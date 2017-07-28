package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Tracks
        final TextView tracksView = (TextView) findViewById(R.id.tracks);

        // Set a clickListenter on that View
        tracksView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TracksActivity}
                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);

                // Start the new activity
                startActivity(tracksIntent);
                //tracksView.setBackgroundResource(R.color.colorBar);
            }
        });

        // Find the View that shows the Albums
        final TextView albumsView = (TextView) findViewById(R.id.albums);

        // Set a clickListenter on that View
        albumsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
                //tracksView.setBackgroundResource(R.color.colorBar);
            }
        });

        // Find the View that shows the Artists
        final TextView artistsView = (TextView) findViewById(R.id.artists);

        // Set a clickListenter on that View
        artistsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
                //tracksView.setBackgroundResource(R.color.colorBar);
            }
        });

        // Find the View that shows the Genres
        final TextView genresView = (TextView) findViewById(R.id.genres);

        // Set a clickListenter on that View
        genresView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenresActivity}
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
                //tracksView.setBackgroundResource(R.color.colorBar);
            }
        });

        // Find the View that shows the Playlists
        final TextView playlistsView = (TextView) findViewById(R.id.playlists);

        // Set a clickListenter on that View
        playlistsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
                //tracksView.setBackgroundResource(R.color.colorBar);
            }
        });

        // Find the View that shows the Folders
        final TextView foldersView = (TextView) findViewById(R.id.folders);

        // Set a clickListenter on that View
        foldersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoldersActivity}
                Intent foldersActivity = new Intent(MainActivity.this, FoldersActivity.class);

                // Start the new activity
                startActivity(foldersActivity);
                //tracksView.setBackgroundResource(R.color.colorBar);
            }
        });

        View firstSongView = findViewById(R.id.linearLayout1);

        firstSongView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayingActivity}
                Intent firstSongIntent = new Intent(MainActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(firstSongIntent);
            }
        });

        View secondSongView = findViewById(R.id.linearLayout2);

        secondSongView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayingActivity}
                Intent secondSongIntent = new Intent(MainActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(secondSongIntent);
            }
        });
    }
}
