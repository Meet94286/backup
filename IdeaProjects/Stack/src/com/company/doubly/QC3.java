package com.company.doubly;

import java.util.*;
public class QC3 {
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

    public static class Stack {
        Node head;
        private int currentSize; // number of items
        public Stack() {
            super();
            head = null;
            currentSize = 0;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void push(int data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
            currentSize++;
        }
        public int pop() {
            if (head == null) {
                return Integer.MIN_VALUE;
            }
            int data = head.getData();
            head = head.getNext();
            currentSize--;
            return data;
        }
        public int peek()
        {
            if (!isEmpty()) {
                return head.data;
            }
            else {
                System.out.println(" ");
                return -1;
            }
        }
        public int size(){
            return currentSize;
        }
    }

    Stack stack = new Stack();
    Queue < Integer > q = new LinkedList < Integer > ();
    Queue < Integer > q1= new LinkedList < Integer > ();

    //The basic push and pop method of a stack are used to create enqueue and dequeue function of a queue
    public void enQueue(int newData) {
        // push(s, x)
        // 1) Let size of q be s.
        /// 1) Enqueue x to q
        //  2) One by one Dequeue s items from queue and enqueue them.
stack.push(newData);
q.add(newData);
while (!q.isEmpty()){
    q1.add(q.remove());
    stack.pop();
}
    }







        //write your code here


        public void deQueue () {

            if (q1.isEmpty()) {
                System.out.println("NA");
            } else {
                System.out.println(q1.remove() + " Dequeued");
            }
        }




        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QC3 obj = new QC3();
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            obj.enQueue(in.nextInt());
        }
        obj.deQueue();
        obj.deQueue();
      obj.deQueue();
    }
}