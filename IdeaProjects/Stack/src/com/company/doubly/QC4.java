package com.company.doubly;

import java.util.*;

public class QC4 {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
       sort(queue);
    }
    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> temp=new Stack<>();

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {

            int t = stack.pop();
         ///   System.out.println(stack+"1");
            while (!temp.isEmpty() && temp.peek() <t) {
                stack.push(temp.pop());
             //   System.out.println(stack+" stack");
            }
            temp.push(t);
           // System.out.println(temp+" temp");
        }
        while (!temp.isEmpty()) {
            queue.add(temp.pop());
        }
        System.out.println(queue);
    }

}
