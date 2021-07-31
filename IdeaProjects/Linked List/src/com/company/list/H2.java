package com.company.list;


import java.util.*;

// Java program to remove duplicates from a sorted linked list
class Homework1 {
    Node head;

    //class to create nodes.
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void noRepeat() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;

            } else {
                temp = temp.next;
            }
        }
    }
      /*  Node prev = head;

        while (temp != null) {
                if (temp.data != prev.data) {
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        if (prev != temp) {
            prev.next = null;
        }*/





    // Below methods would help you create a singly linked list.
    // inserts a new node at the end of the list.
    public void insert(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    // Method that will print the linked list.
    void print_list() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        Homework1 obj = new Homework1();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            obj.insert(in.nextInt());
        }
     obj.noRepeat();
       obj.print_list();
    }
}