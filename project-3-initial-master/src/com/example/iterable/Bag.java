package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {

private ArrayList<T> list;

    public Bag() {
        this.list = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public void add(T item) {
        this.list.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }
}
