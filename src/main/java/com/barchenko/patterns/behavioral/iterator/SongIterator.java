package com.barchenko.patterns.behavioral.iterator;

import java.util.Iterator;

public interface SongIterator<T> {
    Iterator<T> createIterator();
}
