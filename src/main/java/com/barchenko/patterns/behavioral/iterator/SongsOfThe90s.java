package com.barchenko.patterns.behavioral.iterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class SongsOfThe90s implements SongIterator<SongInfo> {
    Map<Integer, SongInfo> bestSongs = new Hashtable<>();
    int hashKey = 0;

    public SongsOfThe90s() {
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
    }

    private void addSong(String name, String band, int year) {
        SongInfo songInfo = new SongInfo(name, band, year);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.values().iterator();
    }
}
