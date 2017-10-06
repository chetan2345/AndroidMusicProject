package com.example.romitnagda.finalproject;

import android.os.Environment;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class Reader {

    final String MEDIA_PATH = Environment.getExternalStorageDirectory().getPath() + "/";
    private ArrayList<Song> songsList = new ArrayList<Song>();
    private String mp3Pattern = ".mp3";

    public ArrayList<Song> getPlayList() {
        System.out.println(MEDIA_PATH);
        if (MEDIA_PATH != null) {
            File home = new File(MEDIA_PATH);
            File[] listFiles = home.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                    } else {
                        addSongToList(file);
                    }
                }
            }
        }
        return songsList;
    }

    private void addSongToList(File song) {
        if (song.getName().endsWith(mp3Pattern)) {
            Song newSong = new Song(song.getName().substring(0, (song.getName().length() - 4)),
                    song.getPath());

            songsList.add(newSong);
        }
    }
}
