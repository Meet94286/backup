package com.company.recursion;

import java.util.Scanner;

class Swaps {
    static void totalBubbleSortSwaps(int[] array, int m) {
        int n = array.length;
        int count=0;
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (array[j] < array[j + 1]) {
                    count++;
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }
        }System.out.println(count);
        for (int ele : array) {
            System.out.println(ele);
        }
    }
   // 5

        //    10

          //  10 9 8 7 6 5 4 3 2 1




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int m = scanner.nextInt();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        totalBubbleSortSwaps(array, m);
    }
}
