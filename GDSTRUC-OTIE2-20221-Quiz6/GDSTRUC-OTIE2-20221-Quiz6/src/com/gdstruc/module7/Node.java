package com.gdstruc.module7;

public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;
    private int temp1;
    private int temp2;

    public void insert(int value) //LEFT SMALLER
    {
        if (value == data) //DUPLICATED VALUES DISCARDED
        {
            return;
        }

        if (value < data) //LEFT CHILD
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else //FOR THE RIGHT SIDE IF VALUE IS GREATER THAN DATA
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }

        temp1 = 2147483647;
        temp2 = -2147483648;
    }

    public void traverseInOrder()
    {
        if (leftChild != null)
        {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);
        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        if (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else
        {
            if (rightChild != null)
            {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public Node getMin()
    {
        if (temp1 > data)
        {
            temp1 = data;
            if (leftChild != null)
            {
                return leftChild.getMin();
            }
        }
        System.out.println("LEAST VALUE IN TREE: " + data);
        return null;
    }

    public Node getMax()
    {
        if (temp2 < data)
        {
            temp2 = data;

            if (rightChild != null)
            {
                return rightChild.getMax();
            }
        }
        System.out.println("MAXIMUM VALUE IN TREE: " + data);
        return null;
    }

    public void traverseInOrderDescending()
    {
        if (rightChild != null)
        {
            rightChild.traverseInOrderDescending();
        }
        System.out.println("Data: " + data);
        if (leftChild != null)
        {
            leftChild.traverseInOrderDescending();
        }
    }



    public Node(int _data)
    {
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public int getTemp1() {
        return temp1;
    }

    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }

    public int getTemp2() {
        return temp2;
    }

    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

}
