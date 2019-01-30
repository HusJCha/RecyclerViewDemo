package com.recyclerviewdemo.android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder>
{
    private List<Movie> movielist;
    public MoviesAdapter(List<Movie> movielist) {
        this.movielist = movielist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.get_all_movie,null);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = movielist.get(position);
        holder.tv_nm.setText(movie.getName());
        holder.tv_gen.setText(movie.getGen());
        holder.tv_year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movielist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_nm,tv_gen,tv_year;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_nm = itemView.findViewById(R.id.tv_nm);
            tv_gen = itemView.findViewById(R.id.tv_gen);
            tv_year = itemView.findViewById(R.id.tv_year);
        }
    }
}
