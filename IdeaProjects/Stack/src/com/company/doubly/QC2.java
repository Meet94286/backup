package com.company.doubly;

import java.util.*;
public class QC2 {
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
        Node head;
        Node tail;
        private int currentSize; // number of items

        public Queue() {
            super();
            head = null;
            tail = null;
            currentSize = 0;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void enQueue(int data) {
            Node node = new Node(data);
            if (tail == null) {
                tail = node;
                head = node;
            } else {
                tail.setNext(node);
                tail = tail.getNext();
            }
            currentSize++;
        }

        public int deQueue() {
            int data = head.getData();
            head = head.getNext();
            if (head == null) { // it means it has got empty
                tail = null;
            }
            currentSize--;
            return data;
        }

        public int peek() {
            return head.data;
        }

        public int size() {
            return currentSize;
        }
    }

    Queue q = new Queue();
    Stack<Integer> stack=new Stack<>();

    /* Push operation of stack using queue*/  // Queue q = new LinkedList < Integer > ();
    /* Push operation of stack using queue*/
    void push(int x) {
        int size =q.size();
        q.enQueue(stack.push(x));


      //  int size = q.size();

        /* Add new element in the queue */
      /*  q.enQueue(x);
        for (int i = 0; i < size; i++) {
            int t = q.deQueue();
            q.enQueue(t);
        }*/

        /* Pop (or Dequeue) all previous elements and put them after current element */

    }
    /*Removes the top element of the stack*/

    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(0);
        } else {
            int x = stack.peek();
            stack.pop();
           // System.out.println(x);
        }
    }

    /*Returns the element at the top of the stack */
    int top() {
        if(stack.isEmpty()){
            return 1;
        }else {
            return stack.peek();
        }


    }





    public static void main(String[] args) {
        QC2 obj = new QC2();
        Scanner in = new Scanner(System.in);
        /*Enter the number of elements you want to add in the stack */
        int n = in .nextInt();
        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push( in .nextInt());
        }
        System.out.println(obj.top());
       obj.pop();
       System.out.println(obj.top());
    }
}