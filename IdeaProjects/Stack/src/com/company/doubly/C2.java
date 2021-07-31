package com.company.doubly;

import java.util.*;

public class C2 {

    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        Stack<Integer> temp = new Stack<>();

        while (!input.isEmpty()) {

            int t = input.pop();

            while (!temp.isEmpty() && temp.peek() < t) {
                input.push(temp.pop());
            }
            temp.push(t);

        }
        return temp;


            //write your code here
        }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        Stack<Integer> temp = new Stack<>();
        if (sortedStack.isEmpty()) {
            System.out.println("stack is empty");
        }
        if (k > sortedStack.size()) {
            System.out.println("invalid input");
        }
        while (!sortedStack.isEmpty()) {

            int t = sortedStack.pop();

            while (!temp.isEmpty() && temp.peek() > t) {
                sortedStack.push(temp.pop());
            }
            temp.push(t);

        }
        System.out.println(temp);


        int count = 0;
        while (!temp.isEmpty()) {

            count++;
            int t = temp.pop();


            if (count == k) {

               System.out.println(t);
                break;
            }
        }



        }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add(in.nextInt());
        }
        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }
        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }
        // This is the temporary stack
      Stack < Integer > temp = sortStack(inputStack);
        System.out.println(temp);
        findKthLargestNum(temp, k);
    }
}