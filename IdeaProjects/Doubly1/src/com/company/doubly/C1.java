package com.company.doubly;

import java.util.*;
import java.lang.*;
public class C1{
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int i) {
            data = i;
            next = null;
        }
    }
    static C1 insert(C1 list, int data) {
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
        new_node.next = head;
        return list;
    }
    public static Node getNode(Node head, int k) {

        if(head==null){
            return null;
        }
        Node temp = head;
        int count = 1;
        do {
            count++;
            temp=temp.next;
            head=temp;



        }while (count!=k);
       // System.out.println(count+ "count");
     //   System.out.println(temp.data);
        return temp;
    }
    public static void main(String[] args) {
        C1 list = new C1();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            list = insert(list,sc.nextInt());
        int k=sc.nextInt();
        System.out.println(getNode(head,k).data);
    }
}
//7

     //   12 15 16 12 19 16 19

     //   10