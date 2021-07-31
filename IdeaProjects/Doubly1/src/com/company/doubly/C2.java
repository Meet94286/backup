package com.company.doubly;

import java.util.*;
class C2 {
   static Node head;

    // Creating structure for nodes
    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // This method will push the input data at the end of the list
    void push(int data) {
        Node temp = head;
        Node new_node = new Node(data,null);
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

    void print() {
        Node temp = head;
        Node prev=null;
        if (head == null) {
            return;
        }
        do {

            System.out.print(temp.data + " ");
            temp = temp.next;


        } while (temp != head);
        System.out.println();
        Node current=head;
       Node next;

       do {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }while (current!=head);
       head.next=prev;
       head=prev;
       do {
           System.out.print(prev.data+" ");
           prev=prev.next;
       }while (prev!=head);




    }


    public static void main(String[] args) {
        C2 obj = new C2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
        }
        obj.print();
    }
}