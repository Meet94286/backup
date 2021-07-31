package com.company.doubly;

public class stack {

    private int[] stackArray;
    private  int top;
    private Node head;

    public stack( int size) {
        this.stackArray = new int[size];
        this.top = -1;
        this.head=null;
    }

    //1 . Add element
    public void push(int data){
       if(isFull()){
           System.out.println("Overflow");
       }
       stackArray[++top]=data;
    }

    //2. Remove element
    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -99;
        }
        return stackArray[top--];
    }

    //3. See top element
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -99;
        }
        return stackArray[top];
    }

    //4. Check stack is empty or not
    public boolean isEmpty(){
        return top==-1;
    }

    //5. Check stack is full or not
    public boolean isFull(){
        return top==stackArray.length-1;
    }

    //For Linked List


    public void addFront(int data){
        if(head==null){
            head=new Node(data,null);
        }else
        {
            Node temp=new Node(data,null);
            temp.next=head;
            head=temp;
        }
    }
    public int deleteFront(){
        int temp=head.data;
        head=head.next;
        return temp;
    }

    //1. push
    public void pushLl(int data){
        addFront(data);
    }

    public int popLl(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -99;
        }
        return deleteFront();
    }

    //3. See top element
    public int peekLl(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -99;
        }
        return head.data;
    }

    //4. Check stack is empty or not
    public boolean isEmptyLl(){
        return head==null;
    }

    //5. Check stack is full or not
    public boolean isFullLl(){
        return false;
    }


}
