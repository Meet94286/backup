package com.company.doubly;

import java.util.*;
import java.util.*;

public class QC1 {
    public static class Node {
        private int data;
        private Node next;

        Node(int data) {
            super();
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public static class Queue {
        Node front, rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }


        public void enQueue(int key) {

            Node temp = new Node(key);


            if (this.rear==null) {
               // System.out.println("Queue is empty");
                this.front = this.rear = temp;
            }
            this.rear.next = temp;
            this.rear = temp;
        }

        public int deQueue() {
            if (this.front == null) {
                System.out.println("q");
                return -99;
            }
            Node temp = this.front;
            this.front = this.front.next;
           // return temp.data;

            if (this.front==null){
                this.rear=null;
            }
return temp.data;
        }
    }
    public static void main(String[] args){
        Queue Q = new Queue();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            Q.enQueue(in .nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Q.deQueue());
        }
    }
}