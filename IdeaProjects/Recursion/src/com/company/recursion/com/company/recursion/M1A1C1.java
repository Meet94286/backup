package com.company.recursion;

import java.util.*;

public class M1A1C1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        mergeSortedArrays(arr1, arr2);
    }

    public static void mergeSortedArrays(int arr1[], int arr2[]) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int l = 0, r = 0, k = 0;
        while (l < arr1.length && r < arr2.length) {
            if (arr1[l] <=arr2[r]) {
                arr3[k++] = arr1[l++];
            } else {
                arr3[k++] = arr2[r++];
            } }
        while (l < arr1.length) {
            arr3[k++] = arr1[l++];
        }
        while (r < arr2.length) {
            arr3[k++] = arr2[r++];
        }
        for (int m = 0; m < arr3.length; m++) {
            int n;

            for (n = 0; n < m; n++) {
                if (arr3[m] == arr3[n]) {
                    break;

                } }
            if (m == n) {
                System.out.println(arr3[m] +" ");
            }

        }

    }
}

