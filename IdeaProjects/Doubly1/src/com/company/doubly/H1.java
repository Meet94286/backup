package com.company.doubly;

import java.util.*;

public class H1 {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int i) {
            data = i;
            next = null;
        }
    }

    static H1 insert(H1 list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null)
            list.head = new_node;
        else {
            Node last = list.head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = new_node;
        }
        new_node.next=head;
        return list;
    }
    static Node reverseCircular(Node headRef) {

        if(headRef==null){
            return null;
        }
        Node current=headRef;
        Node prev = null;
        Node next= null;
        do {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }while (current!=headRef);
headRef.next=prev;
        headRef=prev;
        return prev;
    }
    static void printCircular(Node head) {
        if(head==null){
            return;
        }
        Node temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while (temp!=head);

    }
    public static void main(String[] args) {
        H1 list = new H1();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            list = insert(list,sc.nextInt());
        head = reverseCircular(head);
        printCircular(head);
    }
}