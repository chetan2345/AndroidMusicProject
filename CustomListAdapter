package com.example.romitnagda.finalproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Song> {

    public CustomListAdapter(Context context, ArrayList<Song> objects) {
        super(context, R.layout.song_list, objects);
    }

    @Override
    public @NonNull
    View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (view == null) {
            view = inflater.inflate(R.layout.song_list, parent, false);
        }
        Song song = getItem(position);
        TextView title = (TextView) view.findViewById(R.id.song_title);
        title.setText(song.getTitle());
        return view;
    }

}
