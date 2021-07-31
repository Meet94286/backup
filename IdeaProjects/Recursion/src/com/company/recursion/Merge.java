package com.company.recursion;

import java.io.*;
import java.util.*;
public class Merge {
    public static void merge(int [] left,int[] right, int[] mergedArray) {
        int l = 0, r = 0, m = 0;
        while (l < left.length && r < right.length) {
            if (right[r] <=left[l]) {
                mergedArray[m]=left[l++];
              //  mergedArray[m]=left[l++];
               // System.out.println("L " +mergedArray[m]);
            } else {
                mergedArray[m] = right[r++];
               // mergedArray[m]=left[l++];

             //   System.out.println("R " +mergedArray[m]);
            }
            //System.out.println(mergedArray[m]);
        }
        while (l < left.length) {
            mergedArray[m++] = left[l++];
        }
        while (r < right.length) {
            mergedArray[m++] = right[r++];
        }

    }
    public static void mergeSort(int[] arr){
        int n= arr.length;

        if(n==1){
            return;
        }
        int mid =n/2;
        int [] left=new int[mid];
        int[] right = new int[n-mid];

        for (int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for (int i=mid;i<n;i++){
            right[i-mid]=arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);

    }


    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       // int n = scanner.nextInt();
        int[] arr = {10,44, 77,11};
      //  int[] arr1 = {6, 7, 5, 9, 10};
        mergeSort(arr);
      //  mergeSort(arr1);
       /* for(int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }*/
      for (int ele:arr){
          System.out.print(ele+" ");
      }

    }
}