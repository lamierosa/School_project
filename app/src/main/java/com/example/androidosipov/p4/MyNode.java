package com.example.androidosipov.p4;

public class MyNode<T> implements Comparable<MyNode<T>> {

    private T value;
    private MyNode<T> next;

    public MyNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    @Override
    public int compareTo(MyNode<T> t2) {
        return this.getValue().toString()
                .compareTo(t2.getValue().toString());
    }

}
