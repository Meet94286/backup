package com.company.doubly;

import java.util.*;

// Split circular linked list in two halves
// if no of nodes are odd then
class C3 {
    static Node head;
    static Node h1,h2;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
    void divide() {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return;
        }
        if (head.next == head) {
            System.out.println("NA");
        } else {

        /* If there are odd nodes in the circular list then
         fast->next becomes head and for even nodes
         fast->next->next becomes head */
            while (fast.next != head
                    && fast.next.next != head) {
                fast = fast.next.next;
                slow = slow.next;
            }

            /* If there are even elements in list then move fast */
            if (fast.next.next == head) {
                fast = fast.next;
            }

            /* Set the head pointer of first half */
            h1 = head;


            /* Set the head pointer of second half */
            if (head.next != head) {
                h2 = slow.next;
            }
            /* Make second half circular */
            fast.next = slow.next;

            /* Make first half circular */
            slow.next = head;
        }

    }


    //Method to add nodes at the end of the list
    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            new_node.next=head;
        } else {
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }
    }


    //Method to print data value of nodes of the linked list
    void print(Node temp) {
        Node node = temp;
        if (temp != null) {
            do {
                System.out.print(node.data + " ");
                node = node.next;
            } while (node != temp);
        }
    }

    public static void main(String[] args) {
        C3 list = new C3();
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0; i<n; i++) {
            list.push(in.nextInt());
        }
        list.divide();
     System.out.println("");
     list.print(h1);
      System.out.println("");
      list.print(h2);
    }
}