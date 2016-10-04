package com.nanodegree.sameejos.projectpopularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MovieGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_grid);

        getSupportActionBar().setTitle(R.string.tmdb);
    }
}
