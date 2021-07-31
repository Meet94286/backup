package com.company.recursion;

import java.util.Scanner;

public class occuruneces1 {
    public static int findOccur1(int[] arr, int key, int low, int high) {
        int first = 0, last = 0;
        low = 0;
        high = arr.length - 1;
        int mid = (low + high) / 2;

        if (arr[mid] == key && arr[mid - 1] != arr[mid]) {
            mid = first;
        }
        if (arr[mid] == key && arr[mid + 1] != arr[mid]) {
            mid = last;
            int c = (last - first) + 1;
            return c;
        }
        if (arr[mid] > key) {
            return findOccur1(arr, key, low, mid - 1);
        } else {
            return findOccur1(arr, key, mid + 1, high);
        }
    }

    public static int findOccur(int[] arr, int size, int num) {
        return findOccur1(arr, num, 0, size);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        int freq = findOccur(arr, size, num);
        if (freq != 0)
            System.out.print(freq);

    }
}








