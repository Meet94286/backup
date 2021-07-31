package com.company.H;

import java.util.*;
import java.lang.*;
import java.lang.Math;

public class test {
    public static int PopElements(int N, int[] A) {

        // Approach - Fill two stack in one loop
        //one is as input and second is reverse of input
        //pop one ele from reversed stack and push to stack 2 then one from input stack and push to stack2
        //when both stack reach middle ele stop the process
        //pop elements from the stack2 and print it.
        N = A.length;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        if (N == 0) {
            return -99;
        }
        if (N == 1) {
            return A[N - 1];
        }
        if (N == 2) {
            System.out.println(A[N - 1]);
            System.out.println(A[N - 2]);
            System.exit(0);
        } else {
            for (int i = 0; i < A.length; i++) {
                stack.push(A[i]);

                stack1.push(A[N - 1 - i]);
            }
            while (!stack.isEmpty()) {
                 stack2.push(stack1.pop());
                 stack2.push(stack.pop());

                if (stack.peek() == A[N / 2]) {
                    break;
                }
            }
            if (N % 2 == 0) {
                stack2.push(stack1.pop());
                stack2.push(stack.pop());
            } else {
                stack2.push(stack.pop());
            }
            while (!stack2.isEmpty()) {
                int t = stack2.pop();
                System.out.print(t + " ");
            }
            System.exit(0);
            return 0;
        }
        return N;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++){
            A[i]=sc.nextInt();

        }

        System.out.print(PopElements(N,A));
        sc.close();
    }
}

//15 91 12 7
//4 74 27 7
//8 84 37 8
//3 5 23 10 7
//1 27 27 23 1
//1 30 47 7
//0 47 30 6
//2 39 71 5
//2 43