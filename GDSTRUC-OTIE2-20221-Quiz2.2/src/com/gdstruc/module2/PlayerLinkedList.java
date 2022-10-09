package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;


    // function to add a new player to the fron of the linked lits
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode current = head;
        current = current.getNextPlayer();

        PlayerNode placeHolder = current;

        head = current; //DISCONNECTION OF ELEMENT 1 BY MOVING THE HEAD TO ELEMENT 2
        int size = 0;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer();
            size++;
        }
        current = placeHolder; //BONUS PART OF DOUBLE LINKED LIST
        System.out.print(current.getPlayer() + "\n");

       // System.out.print(" NULL\n");
        System.out.print("Element Size: " + size + "\n"); //SIZE VARIABLE
    }
}