package com.company.recursion;

import java.util.*;

public class BubbleSort {
    public static void descendingBubbleSort(int arr[], int size) {
        size=arr.length;
        for(int i=0;i<size-1;i++){
            //boolean Isdone=true;

            for(int j=0;j<size-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }for(int ele:arr){
            System.out.println(ele);
        }

    }


    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        descendingBubbleSort(arr, size);
    }
}