package com.example.androidosipov.p4;

import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {


    private T[] items;
    private int size = 0;


    public MyArrayList(int size) {
        items = (T[]) new Object[size];
    }

    public MyArrayList() {
        this(10);
    }

    public void add(T next) {
        if (this.size >= this.items.length) {
            Object[] array = new Object[this.size*2];
            System.arraycopy(this.items, 0, array, 0, this.size);
            this.items = (T[]) array;
        }
        this.items[this.size] = next;
        this.size++;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
//            throw new ArrayIndexOutOfBoundsException();
        return null;
        }
        return this.items[index];
    }

    public void remove (int index) {
        if (index < 0 || index >= this.size) {
            return;
        }
        if (index == this.size - 1) {
            this.items[this.size--] = null;
        } else {
            System.arraycopy(items, index+1, items, index, size - index - 1);
            this.items[this.size--] = null;
        }
    }

    public int getSize() {
        return size;
    }

    @NonNull
    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    public class MyArrayListIterator implements Iterator<T> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            T next = items[cursor];
            cursor++;
            return next;
        }
    }
}
