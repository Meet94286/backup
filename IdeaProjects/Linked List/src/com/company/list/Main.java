package com.company.list;

import java.util.Arrays;

public class Main {

    public static Node head = null;



    // 1. Printing List
    public static void print() {

        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;

            if (temp != null) {
                System.out.print("->");
            }
        }
    }

    // 2. Finf length of LL
    public static int length() {

        if (head == null) {
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;


    }

    // 3. Search node
    public static void SearchNode(int a) {
        if (head == null) {
            System.out.println("No nodes in list ");
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == a) {
                System.out.print("Found Node->" + temp.data);
                // System.out.print(temp.data);
            }

            temp = temp.next;
        }
        System.out.println("No found");
    }

    // 4. UpdateValue
    public static void UpdateValue(Node x2) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("Nodes->" + temp.data);

            if (temp == x2) {
                temp.data = 5;
                //            System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

    // 5. Find Middle
    public static int FindMiddle() {
        if (head == null) {
            return 0;
        }
        //  Node temp=head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) {
            return slow.data;
        } else {
            return (slow.data + slow.next.next.data) / 2;
        }
    }

    // 6. Nth element
    public static int NthElement(int n) {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == n) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        assert (false);
        return 0;
    }

    //7. AddFront
    public static void AddFront(int d) {
        if (head == null) {
            Node temp = new Node(d, null);
            head = temp;
        } else {
            Node temp = new Node(d, null);
            temp.next = head;
            head = temp;
        }
        //   Node temp = head;return temp.data;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //8. deleteFront
    public static void deleteFront()  {
        if (head == null) {
            System.out.println("Nothing to delete");
        } else {
            // Node temp = head;
            head = head.next;
            // head.next = temp;
        }
        //int temp=head.data;return  head.data;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //9. AddEnd
    public static void AddEnd(int d) {
        if (head == null) {
            Node temp = new Node(1, null);
            temp = head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            Node t = new Node(5, null);
            temp.next = t;
        }
    }

    //10. deleteEnd
    public static int deleteEnd() {

        if (head == null) {
            System.out.println("Nothing to delete");
        } else if (head.next == null) {
            int temp = head.data;
            head = null;
            return temp;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            return temp.data;
        }
        return -99;
    }

    //11.   addAfter
    public static int addAfter(int data, int d) {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                break;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            AddEnd(d);
            return temp.data;
        }
        Node t = new Node(10, null);
        t.next = temp.next;
        temp.next = t;
        return temp.data;
    }

    //12. deleteAfter
    public static int deleteAfter(int data, int d) {
        if (head == null || head.next == null) {
            System.out.println("Deletion not possible");
            return 0;
        }
        Node temp = head;
        while (temp != null || temp.next == null) {
            if (temp.data == data) {
                break;
            }
            temp = temp.next;
        }
        if (temp.next.next == null) {
            if (temp.data == data) {
                temp.next = null;
            }
        } else {
            temp.next = temp.next.next;
            return temp.data;
        }
        return -99;
    }

    public void linkedList(Node head, boolean flag) {
        if (head == null)
            return;
        if (flag)
            System.out.println(head.data);
        linkedList(head.next, !flag);
    }
   public static void fun(Node head){
       Node temp = head;
        if (temp == null)
            return;
        fun(temp.next);
        System.out.print(temp.data + " ");
    }



    public static void main(String[] args) {
        Node x3 = new Node(30, null);
        Node x2 = new Node(20, null);
        Node x1 = new Node(10, null);
        Node x4 = new Node(40,null);
        Node x5 = new Node(5,null);

        head=x1;
        x1.next = x2;
       x2.next = x3;
        x3.next = x4;


       /* System.out.println(x3);
        System.out.println(x2.next);
        System.out.println(x1.data);

        System.out.println();
        System.out.println(length());
        SearchNode(4);
      //  UpdateValue(x2);*/
       System.out.println(FindMiddle());
       /* System.out.println(NthElement(0 ));
        AddFront(0);
        System.out.println();
        deleteFront();
        System.out.println();
        AddEnd(5);
        print();
        System.out.println();*/
       // System.out.println(deleteEnd());
      //  deleteFront();
      //  System.out.println(addAfter(2 ,10));
      //  System.out.println(deleteAfter(2,10));
        print();


        }
}



