package com.company.cl;


public class Main {


public static class Node{
    int data;
    Node next;
    public Node(int data,Node next) {
        this.data = data;
        this.next=next;
    }

}

    //Declaring head and tail pointer as null.
    public static Node head = null;
    public static Node tail = null;

    //This function will add the new node at the end of the list.
    public static void addAtStart(int data){
        //Create new node
        Node newNode = new Node(data, null);
        //Checks if the list is empty.
        if(head == null) {
            //If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            //Store data into temporary node
            Node temp = head;
            //New node will point to temp as next node
            newNode.next = temp;
            //New node will be the head node
            head = newNode;
            //Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }

    //Displays all the nodes in the list
    public static  void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
         }
        else {
            do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main cl = new Main();

        System.out.println("1st");
        addAtStart(1);
        cl.display();
        //Adding 2 to the list
        cl.addAtStart(2);
        cl.display();
        //Adding 3 to the list
        cl.addAtStart(3);
        cl.display();
        //Adding 4 to the list
        cl.addAtStart(4);
        cl.display();




    }
}
