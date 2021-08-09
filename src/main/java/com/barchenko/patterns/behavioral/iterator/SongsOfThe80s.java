package com.barchenko.patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator<SongInfo>{
    SongInfo[] bestSongs;

    int arrayValue = 0;

    public SongsOfThe80s() {
        this.bestSongs = new SongInfo[3];
        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);

    }

    private void addSong(String name, String band, int year) {
        SongInfo song = new SongInfo(name, band, year);
        bestSongs[arrayValue] = song;
        arrayValue++;

    }

    public SongInfo[] getBestSongs() {
        return bestSongs;
    }


    @Override
    public Iterator<SongInfo> createIterator() {
        return Arrays.stream(bestSongs).iterator();
    }
}
