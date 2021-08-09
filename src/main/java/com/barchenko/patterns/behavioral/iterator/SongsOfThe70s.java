package com.barchenko.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongIterator<SongInfo>{

    List<SongInfo> songInfoList;

    public SongsOfThe70s() {
        this.songInfoList = new ArrayList<>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

    private void addSong(String name, String band, int year) {
        SongInfo songInfo = new SongInfo(name, band, year);
        songInfoList.add(songInfo);
    }

    public List<SongInfo> getSongInfoList() {
        return songInfoList;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return songInfoList.iterator();
    }
}
