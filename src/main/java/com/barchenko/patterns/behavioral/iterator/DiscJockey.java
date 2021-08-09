package com.barchenko.patterns.behavioral.iterator;

import java.util.Iterator;

public class DiscJockey {
    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    SongIterator<SongInfo> iter70sSongs;
    SongIterator<SongInfo> iter80sSongs;
    SongIterator<SongInfo> iter90sSongs;

    public DiscJockey(SongIterator<SongInfo> iter70sSongs, SongIterator<SongInfo> iter80sSongs, SongIterator<SongInfo> iter90sSongs) {
        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    public void showTheSongs() {
        Iterator<SongInfo> songInfoIterator70 = iter70sSongs.createIterator();
        Iterator<SongInfo> songInfoIterator80 = iter80sSongs.createIterator();
        Iterator<SongInfo> songInfoIterator90 = iter90sSongs.createIterator();
        System.out.println("-------------------");
        printTheSongs(songInfoIterator70);
        System.out.println("-------------------");
        printTheSongs(songInfoIterator80);
        System.out.println("-------------------");
        printTheSongs(songInfoIterator90);
    }

    private void printTheSongs(Iterator<SongInfo> songsIterator) {
        SongInfo songInfo = songsIterator.next();
        System.out.println(songInfo.getSongName());
        System.out.println(songInfo.getBandName());
        System.out.println(songInfo.getYearReleased());
    }
}
