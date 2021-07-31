package com.company.recursion;

import java.io.*;
import java.util.*;
public class H1 {

    // Sorting a array as first element is largest and then smallest
    public static void alternativeSorting(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;
        int index=0;
        int [] arr1 = new int[arr.length];
        while (i<j){

            int small=arr[i++];
            int large=arr[j--];
            arr1[index++]=large;
            arr1[index++]=small;
        }
        if(i==j){
            arr1[index]=arr1[i];
        }

        for (int k=0;k< arr.length;k++){
            arr[k]=arr1[k];
        } }

    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        alternativeSorting(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}