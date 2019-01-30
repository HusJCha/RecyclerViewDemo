package com.recyclerviewdemo.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ArrayList<Movie> movielist = new ArrayList<>();
    RecyclerView recyclerView;
    MoviesAdapter moviesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recview_list);
        moviesAdapter = new MoviesAdapter(movielist);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(moviesAdapter);
        prePareMovieData();
    }

    private void prePareMovieData()
    {
        Movie movie =new Movie("Bahubali","falana","2017");
        movielist.add(movie);
        movie = new Movie("thikna","puchda","2154");
        movielist.add(movie);
        movie = new Movie("The LEGO Movie", "Animation", "2014");
        movielist.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        movielist.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "1986");
        movielist.add(movie);

        movie = new Movie("Chicken Run", "Animation", "2000");
        movielist.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "1985");
        movielist.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movielist.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
        movielist.add(movie);

        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movielist.add(movie);
        moviesAdapter.notifyDataSetChanged();
    }
}
