package com.gdstruc.midterms;

import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] stack;
    private int top;
    private int stackCount;

    public ArrayStack(int capacity)
    {
        stack = new Player[capacity];
    }

    public void push(Player player)
    {
        if (top == stack.length)
        {
            Player[] newStack = new Player[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = player;
    }

    public Player pop()
    {
        if (isEmpty())
        {
            return null; //throw new EmptyStackException();
        }
        Player poppedPlayer = stack[--top];
        stack[top] = null;
        return poppedPlayer;
    }

    public Player peek()
    {
        if (isEmpty())
        {
            return null; //System.out.println("Empty Stack: "); //throw new EmptyStackException();
        }
        return stack[top - 1];
    }
    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        //System.out.println("Printing stack: ");
        stackCount = 0;
        for (int i = top - 1; i >= 0; i--)
        {
  /*          if (stack[i] == null)
            {

            }
            else
                System.out.println(stack[i]);*/
            System.out.println(stack[i]);
            stackCount++;
        }
        System.out.println("Number of Cards: " + stackCount);

    }

    public void stackNumber()
    {
        stackCount = 0;
        for (int i = 0; i < top; i++)
        {
            stackCount++;
            System.out.println("X value: " + stackCount);
        }
    }

}
