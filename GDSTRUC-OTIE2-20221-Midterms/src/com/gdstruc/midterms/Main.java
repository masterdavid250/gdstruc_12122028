package com.gdstruc.midterms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayStack mainDeck = new ArrayStack(30);
        ArrayStack discardPile = new ArrayStack(30);
        ArrayStack hands = new ArrayStack(30);

        mainDeck.push(new Player(1, "hearts"));
        mainDeck.push(new Player(2, "hearts"));
        mainDeck.push(new Player(3, "hearts"));
        mainDeck.push(new Player(4, "hearts"));
        mainDeck.push(new Player(5, "hearts"));
        mainDeck.push(new Player(6, "hearts"));
        mainDeck.push(new Player(7, "hearts"));
        mainDeck.push(new Player(8, "hearts"));
        mainDeck.push(new Player(9, "hearts"));
        mainDeck.push(new Player(10, "hearts"));
        mainDeck.push(new Player(1, "spades"));
        mainDeck.push(new Player(2, "spades"));
        mainDeck.push(new Player(3, "spades"));
        mainDeck.push(new Player(4, "spades"));
        mainDeck.push(new Player(5, "spades"));
        mainDeck.push(new Player(6, "spades"));
        mainDeck.push(new Player(7, "spades"));
        mainDeck.push(new Player(8, "spades"));
        mainDeck.push(new Player(9, "spades"));
        mainDeck.push(new Player(10, "spades"));
        mainDeck.push(new Player(1, "diamond"));
        mainDeck.push(new Player(2, "diamond"));
        mainDeck.push(new Player(3, "diamond"));
        mainDeck.push(new Player(4, "diamond"));
        mainDeck.push(new Player(5, "diamond"));
        mainDeck.push(new Player(6, "diamond"));
        mainDeck.push(new Player(7, "diamond"));
        mainDeck.push(new Player(8, "diamond"));
        mainDeck.push(new Player(9, "diamond"));
        mainDeck.push(new Player(10, "diamond"));

        while (mainDeck.peek() != null)
        {
            System.out.println("Press 1 to start next Round: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            while (input != 1)
            {
                System.out.println("Press 1 to start next Round: ");
                input = scanner.nextInt();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~");
            System.out.println("~~ACTION SUMMARY~~");
            System.out.println("~~~~~~~~~~~~~~~~~~");
            input = 0;
            int command = (int)Math.floor(Math.random()*3);
            int drawNumber = 0;
            if (command == 0)
            {
                drawNumber = (int)Math.floor(Math.random()*5 + 1);
                for (int i = 0; i < drawNumber; i++)
                {
                    hands.push(mainDeck.peek());
                    mainDeck.pop();
                    System.out.println("You drew a card from the Deck");
                }
            }
            else if (command == 1)
            {
                drawNumber = (int)Math.floor(Math.random()*5 + 1);
                for (int i = 0; i < drawNumber; i++)
                {
                    if (hands.peek() != null)
                    {
                        discardPile.push(hands.peek());
                        hands.pop();
                        System.out.println("You discarded a card from your hand");
                    }
                    else
                        System.out.println("You discarded nothing");
                }
            }
            else if (command == 2)
            {
                drawNumber = (int)Math.floor(Math.random()*5 + 1);
                for (int i = 0; i < drawNumber; i++)
                {
                    if (discardPile.peek() != null)
                    {
                        hands.push(discardPile.peek());
                        discardPile.pop();
                        System.out.println("You took a card from the discarded pile");
                    }
                    else
                        System.out.println("You took nothing in the discarded pile");
                }
            }
            System.out.println("~~~~~~~~~~~~~~~~~~");
            System.out.println("~~ROUND SUMMARY~~");
            System.out.println("~~~~~~~~~~~~~~~~~~");
            System.out.println("Hand Cards: ");
            hands.printStack();
            System.out.println("Discard Pile: ");
            discardPile.printStack();
            System.out.println("Main Deck: ");
            mainDeck.printStack();
        }
        System.out.println("Game ends. No more card in the Main Deck");
    }
}

