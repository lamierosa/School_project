package com.example.androidosipov.p4;

import java.util.SortedSet;
import java.util.TreeSet;

public class MyBinaryTree<T extends Comparable<T>> {
    private T value;
    private MyBinaryTree<T> lChild;
    private MyBinaryTree<T> rChild;
    public MyBinaryTree(T value) {
        this.value = value;
    }
    public MyBinaryTree() {
    }

    public MyBinaryTree insertNode(T newValue) {
        if (newValue == null) return null;
        if (this.value == null) {
            this.value = newValue;
            return this;
        }
        if (this.value.compareTo(newValue) < 0 ) {
            if (rChild == null) {
                return this.rChild = new MyBinaryTree(newValue);
            } else {
                return this.rChild.insertNode(newValue);
            }
        }
        if (this.value.compareTo(newValue) > 0 ) {
            if (lChild == null) {
                return this.lChild = new MyBinaryTree(newValue);
            } else {
                return this.lChild.insertNode(newValue);
            }
        }
        return null;
    }

    public static void print(MyBinaryTree tree) {
        print(tree, 0);
    }
    public static void print(MyBinaryTree tree, int level) {
        if (tree.rChild != null) print(tree.rChild, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(tree.value);
        if (tree.lChild != null)print(tree.lChild, level + 1);
    }

    public static void main(String[] args) {
        MyBinaryTree<Integer> t = new MyBinaryTree<>();
        int[] a = {5,2,1,3,9,7,6,10};
        for (int i = 0; i < a.length; i++) {
            t.insertNode(a[i]);
        }
        print(t);

        TreeSet<String> tree = new TreeSet<String>();
        // Добавление элементов
        tree.add("abc");
        tree.add("aba");
        // Элементы выводятся в сортированном (лексикографическом) порядке
        // Классы должны быть Comparable
        System.out.println("===== Tree =====");
        for (String s : tree) {
            System.out.println(s);
        }
        System.out.println();
        // Удаление элементов
        System.out.println(tree.remove("aaa"));
        // Удаление несуществующего элемента возвращает False
        System.out.println(tree.remove("abc"));
        System.out.println("===== Tree =====");
        for (String s : tree) {
            System.out.println(s);
        }
        System.out.println();
        tree.add("zzz");
        tree.add("xyz");
        tree.add("zca");

        System.out.println(tree.contains("xyz") + " " + tree.contains("aab"));
        // Выводит наименьший элемент, больший или равный указанного
        System.out.println("ceiling = " + tree.ceiling("zyb"));
        System.out.println(tree.ceiling("zzzz")); // null если нет такого элемента
        // Выводит наибольший, элемент меньший или равный указанного
        System.out.println("floor = " + tree.floor("zyb"));
        System.out.println(tree.floor("a")); // null если нет такого элемента
        System.out.println("===== Subtree =====");
        // Взятие подмножества элементов >= zaa и < zzzz
        SortedSet<String> subtree = tree.subSet("zaa", "zzzz");
        for (String s : subtree){
            System.out.println(s);
        }
        System.out.println();
    }
}
