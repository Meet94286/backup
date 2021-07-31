package com.company.list;

import java.util.Scanner;

class H1 {

    static Node headNode;

    /* Structure of the node of linked list */
    static class Node {

        /* data of the node*/
        int data;

        /* This is used to point the next node of
        the currNode node */
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }


    /* This method does the following:
    1. If there is a loop in the linked list, it should print 'Yes'
    and remove the loop in the linked list and return the head node.
    2. If there is no loop in the linked list, it should print 'No'
    and return the head node of the linked list. */
    public void isContainsLoop() {
        Node fast = headNode;
        Node slow = headNode;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (slow == fast) {
            System.out.println("Yes");

        }
            System.out.println("No");
        }

        public Node removeloop(){
        Node fast=headNode;
        Node slow=headNode;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            if (slow == fast) {
                System.out.println("Yes");
                removeLoop(slow);
            }else
            {
                System.out.println("No");
            }
            return headNode;
    }







 Node removeLoop(Node head) {
     if (head == null || head.next == null)
         return head;

     Node slow = head, fast = head;

     // Move slow and fast 1 and 2 steps
     // ahead respectively.
     slow = slow.next;
     fast = fast.next.next;

     // Search for loop using slow and fast pointers
     while (fast != null && fast.next != null) {
         if (slow == fast)
             break;

         slow = slow.next;
         fast = fast.next.next;
     }

     /* If loop exists */
     if (slow == fast) {
         System.out.println("Yes");
         slow = head;
         while (slow.next != fast.next) {
             slow = slow.next;
             fast = fast.next;
         }

         /* since fast->next is the looping point */
         fast.next = null; /* remove loop */
     }else {
         System.out.println("No");
     } return head;
 }




    /* This method adds a new node with data 'newData' to
    the front of the linked list*/
    public void addAtHead(int newData) {

        /* Create a new Node of data newData */
        Node newNode = new Node(newData);

        /* Now, set the next of the newNode as headNode */
        newNode.next = headNode;

        /* Next, make this newNode as head*/
        headNode = newNode;
    }


    /* This method prints every node of the linked list from the head,
    separating by a space */
    void printLinkedList(Node head) {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        H1 list = new H1();

        Scanner in = new Scanner(System.in);

        /* Get the number of nodes of the linked list from input */
        int n = in.nextInt();

        /* Get all nodes of the linked list from input */
        for (int i = 0; i < n; i++) {
            list.addAtHead(in.nextInt());
        }

        /* Get the value of k from input */
        int k = in.nextInt();

       /* Creating a loop, by making the next node of the last node
        as the kth node from the head of the linked list */
        if (k != 0) {
            Node first = headNode, last;
            for (int i = 0; i < k; i++) {
                first = first.next;
            }
            last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = first;
        }
//list.printLinkedList(headNode);
       // list.isContainsLoop();

        /* Print the linked list after removing the loop */

        list.printLinkedList(list.removeLoop(headNode));
    }
}
