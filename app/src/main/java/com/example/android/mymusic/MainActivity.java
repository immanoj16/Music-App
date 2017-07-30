package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Tracks
        final TextView tracksView = (TextView) findViewById(R.id.tracks);
        Log.v("MainActivity", "It is from tracks activity");

        // Set a clickListenter on that View
        tracksView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TracksActivity}
                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);

                // Start the new activity
                startActivity(tracksIntent);
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
            }
        });

        // Find the View that shows the Artists
        final TextView playlistView = (TextView) findViewById(R.id.playlists);

        // Set a clickListenter on that View
        playlistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });


        // Find the View that shows the Playlists
        final TextView paymentView = (TextView) findViewById(R.id.payment);

        // Set a clickListenter on that View
        paymentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PaymentActivity}
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });

        final View firstSongView = findViewById(R.id.linearLayout1);

        firstSongView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayingActivity}
                Intent firstSongIntent = new Intent(MainActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(firstSongIntent);
            }
        });

        final View secondSongView = findViewById(R.id.linearLayout2);

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
