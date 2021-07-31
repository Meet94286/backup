package com.company.recursion;

import java.util.*;

public class mergesort {
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
        int n = arr1.length, m = arr2.length;
        int[] arr3 = new int[arr1.length + arr2.length];
        int pos = 0;
        for (int ele : arr1) {
            arr3[pos] = ele;
            pos++;
        }
        for (int ele : arr2) {
            arr3[pos] = ele;
            pos++;
        }

        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        for (int i=0;i< arr3.length;i++){
            int ind=i; int tempi=arr3[ind];
            for (int j=i+1;j< arr3.length;j++) {
                if (arr3[i] == tempi) {

                }}
                System.out.println(arr3[i]);
            }
        }

    }
