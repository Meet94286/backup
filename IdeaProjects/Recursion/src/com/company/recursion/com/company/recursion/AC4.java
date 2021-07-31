package com.company.recursion;

import java.util.*;

public class AC4 {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++){
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++){
            arr2[i] = s.nextInt();
        }
        mergeSortedArrays(arr1, arr2);
    }
    public static void mergeSortedArrays(int arr1[], int arr2[]) {
        int n = arr1.length, m=arr2.length;
        Map<Integer,Boolean> arr3 = new HashMap<Integer,Boolean>();

        for(int i = 0; i < n; i++)
        {
            arr3.put(arr1[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            arr3.put(arr2[i], true);
        }


        for (Map.Entry<Integer,Boolean> mergeSortedArray : arr3.entrySet())
        {
            System.out.print(mergeSortedArray.getKey() + " ");
        }

    }


}