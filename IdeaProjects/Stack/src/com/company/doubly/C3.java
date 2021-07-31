package com.company.doubly;

import java.util.*;

public class C3 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
      while (!stack.isEmpty()) {

          int t = stack.pop();
          System.out.println(stack+"1");
          while (!temp.isEmpty() && temp.peek() <t) {
              stack.push(temp.pop());
              System.out.println(stack+" stack");
          }
          temp.push(t);
          System.out.println(temp+" temp");
      }




}
}