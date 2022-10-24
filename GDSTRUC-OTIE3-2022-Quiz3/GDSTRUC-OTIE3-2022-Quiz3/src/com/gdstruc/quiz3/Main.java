package com.gdstruc.quiz3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(20);

        int id = 1, load = 0, x = 0, game = 0, level = 0;
        String name = "A" + id;

        pressEnter();
        initialPrint(x, load, game);
        queueProcess(game, load, x, level, id, name, queue);

        System.out.println("Game Ends");
    }

    private static void queueProcess(int game, int load, int x, int level, int id, String name, ArrayQueue queue) {
        while (game < 10)
        {
            while (load < 5)
            {
                x = ThreadLocalRandom.current().nextInt(1, 7 + 1);
                System.out.println("Players Queued: " + x);
                load += x;
                for (int i = 0; i < x; i++)
                {
                    level = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
                    queue.add(new Player(id, name, level));
                    id++;
                    name = "A" + id;
                }
                System.out.println("Players Remained in Queue: ");
                queue.printQueue();
                System.out.println("Total Players Queued: " + load);
                System.out.println("Games Made: " + game);
                pressEnter();
            }
            System.out.println("Game Starts");
            load -= 5;
            System.out.println("5 Players Dequeued");
            for (int i = 0; i < 5; i++)
            {
                queue.remove();
            }
            System.out.println("Players Remained in Queue: ");
            queue.printQueue();
            System.out.println("Total Players Queued: " + load);
            game++;
            System.out.println("Games Made: " + game);
            pressEnter();
        }

    }

    private static void initialPrint(int x, int load, int game) {
        System.out.println("Players Queued: " + x);
        System.out.println("Total Players Queued: " + load);
        System.out.println("Games Made: " + game);
        pressEnter();
    }

    private static void pressEnter()
    {
        System.out.println("Press ENTER to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}