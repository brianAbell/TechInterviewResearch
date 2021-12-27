package com.company;

class LinkedList
{
    //Class variables for the Linked List
    private static Node head;
    private static int numNodes;

    public LinkedList(Object dat)
    {
        head = new Node(dat);
    }

    public void addAtHead(Object dat)
    {
        Node temp = head;
        head = new Node(dat);
        head.next = temp;
        numNodes++;
    }

    public void addAtTail(Object dat)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new Node(dat);
        numNodes++;
    }

    public void addAtIndex(int index, Object dat)
    {
        Node temp = head;
        Node holder;
        for(int i=0; i < index-1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(dat);
        temp.next.next = holder;
        numNodes++;
    }

    public void addAtIndex(int index, Node node)
    {
        Node temp = head;
        Node holder;
        for(int i=0; i < index-1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = node;
        temp.next.next = holder;
        numNodes++;
    }

    public void deleteAtIndex(int index)
    {
        Node temp = head;
        for(int i=0; i< index - 1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public void switchWithNext(int index)
    {
        if(index != 0)
        {
            Node bOne = find(index - 1);
            Node one = find(index);
            Node two = one.next;

            one.next = two.next;
            bOne.next = two;
            two.next = one;
        }
        else
        {
            Node one = find(index);
            Node two = one.next;

            head = two;
            one.next = two.next;
            two.next = one;
        }
    }

    public static int find(Node n)
    {
        Node t = head;
        int index = 0;
        while(t != n)
        {
            index++;
            t = t.next;
        }
        return index;
    }

    public static Node find(int index)
    {
        Node temp=head;
        for(int i=0; i<index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public static void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.print("\n");
    }

    public static int getSize()
    {
        return numNodes;
    }

    class Node
    {
        //Declare class variables
        private Node next;
        private Object data;

        public Node(Object dat)
        {
            data = dat;
        }

        public Object getData()
        {
            return data;
        }
    }
}
