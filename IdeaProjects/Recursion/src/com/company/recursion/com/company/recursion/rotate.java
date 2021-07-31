package com.company.recursion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class rotate {
    static void rotateArray(int[] arr, int n, int d) {
        // 7

        //  9 6 5 4 2 1 0  2 1 0 9 6 5 4

        //  4
        n = arr.length;
        int m = d % n;

        //Rotate the given array by n times toward left
        for (int i = 0; i < d; i++) {
            int j, first;
            //Stores the first element of the array
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                //Shift element of array by one
                arr[j] = arr[j + 1];
                System.out.println(arr[j]);
            }
            //First element of array will be added to the end
            arr[j] = first;
            System.out.println(arr[j] + "1 ");
        }
        System.out.println();
        //Displays resulting array after rotation
        System.out.println("Array after left rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



            public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int d = s.nextInt();
        rotateArray(arr, n, d);
    }
}