package com.gdstruc.module7;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(-435);
        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(-668);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-20);
        tree.insert(500);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);
        tree.insert(-44);

        tree.traverseInOrder();

        tree.getMin();
        tree.getMax();

        tree.traverseInOrderDescending();
    }
}