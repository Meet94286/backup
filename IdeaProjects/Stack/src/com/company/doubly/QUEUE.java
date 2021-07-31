package com.company.doubly;

public class QUEUE {
    private static int front,rear,capacity;
    private static int Queue[];

    QUEUE(int size){
        front=rear=0;
        capacity=size;
        Queue =new int[capacity];
    }


    //1. Enqueue
    public static void Enqueue(int data){

        if(rear==capacity){
            System.out.println("Queue is full");
        }else
        {
            Queue[rear]=data;
            rear++;
        }
        return;
    }

    //2.Dequeue
    public static void Dequeue(){
        if(front==rear){
            System.out.println("Queue is empty");
        }
        else
        {
            for (int i=0;i<rear-1;i++){
                

            }
        }
    }



}