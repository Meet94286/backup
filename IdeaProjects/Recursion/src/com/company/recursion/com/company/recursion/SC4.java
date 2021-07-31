package com.company.recursion;

import java.util.*;

class SC4 {
    public static int median(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size3 = (arr1.length + arr2.length);
        int[] arr3 = new int[size3];
        int position = 0;
        for (int element : arr1) {
            arr3[position] = element;
            position++;
        }
        for (int element : arr2) {
            arr3[position] = element;
            position++;
        }

        // System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);
        for (int i=0;i<arr3.length-1;i++){}

        //  System.out.println(Arrays.toString(arr3));

        int ele = arr3.length;
        int start = 0;
        int end = arr3.length - 1;
        int mid = (start + end) / 2;
        if(ele==0){
            return 0;
        }
        if (ele % 2 != 0) {
            return arr3[mid];
        }
        if (ele % 2 == 0) {
            return ((arr3[mid - 1] + arr3[(mid + 1)]) / 2);
        }return -99;
    }

    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        int answer = median(arr1, arr2);
        System.out.print(answer);
    }
}