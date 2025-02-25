package com.example.androidosipov.p4;


import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private int size = 0;
    private MyNode<T> head = null;
    private MyNode<T> tail = null;

    public void add(T item) {
        if (size == 0) {
            this.head = new MyNode<>(item);
            this.tail = this.head;
            this.size++;
            return;
        }
        MyNode<T> newNode = new MyNode<>(item);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size || this.size == 0) {
            return null;
        }
        MyNode<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        MyNode<T> prev = null;
        MyNode<T> node = this.head;

        if (index == 0) {
            this.head = this.head.getNext();
            if (this.size == 1) {
                this.tail = this.head;
            }
            this.size--;
            return;
        }

        for (int i = 0; i < index; i++) {
            prev = node;
            node = node.getNext();
        }
        prev.setNext(node.getNext());
        this.size--;
    }

    @NonNull
    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new MLLI();
    }

    public class MLLI implements Iterator<T> {
        MyNode<T> cursor = head;

        @Override
        public boolean hasNext() {
            return cursor!= null;
        }

        @Override
        public T next() {
            T value = cursor.getValue();
            cursor = cursor.getNext();
            return value;
        }
    }
}
