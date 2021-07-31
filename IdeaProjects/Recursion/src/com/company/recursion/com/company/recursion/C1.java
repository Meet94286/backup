package com.company.recursion;

import java.io.*;
import java.util.*;
public class C1 {
    //Sorting an array using merge sort
    public static void mergeSort(int[] arr , int start , int end) {
        start=0;end=arr.length;
        int mid =(start+end)/2;
        int[] left = new int[mid];
        int [] right = new int[end-mid];

        if(end==1){
            return;
        }

        for (int i=0;i<mid;i++){
            left[i]= arr[i];
        }
        for (int j=mid;j<end;j++){
            right[j-mid]= arr[j];
        }

        mergeSort(left,0,mid-1);
        mergeSort(right,mid,end-1);

        merge(left,right,arr);



    }

    public static void merge(int[] left,int[] right,int[] mergedArray) {
        int l = 0, r = 0, m = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                mergedArray[m++] = left[l++];
            }else
            {
                mergedArray[m++]=right[r++];
            }
        }
        while (l<left.length){
            mergedArray[m++]=left[l++];
        }

        while (r<right.length){
            mergedArray[m++]=right[r++];
        }
    }

    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}