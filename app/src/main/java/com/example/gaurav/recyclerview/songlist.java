package com.example.gaurav.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

/**
 * Created by gaurav on 13/10/16.
 */

public class songlist extends RecyclerView.Adapter<songlist.songViewHolder> {

    String[] song_names, song_artist;

    songlist(String[] song_names, String[] song_artist) {
        this.song_names = song_names;
        this.song_artist = song_artist;

        Log.i(TAG,"Songs "+ song_names.length + "Artist - "+song_artist.length);
    }

    @Override
    public songViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.songs,parent,false);
        songViewHolder svw = new songViewHolder(view);
        return svw;
    }

    @Override
    public void onBindViewHolder(songViewHolder holder, int position) {
        holder.name.setText(song_names[position]);
        holder.artist.setText(song_artist[position]);
    }

    @Override
    public int getItemCount() {
        return song_names.length;
    }

    public static class songViewHolder extends RecyclerView.ViewHolder{
        TextView name,artist;

        public songViewHolder(View view){
            super(view);
            name= (TextView) view.findViewById(R.id.name);
            artist = (TextView) view.findViewById(R.id.artist);
        }
    }
}
