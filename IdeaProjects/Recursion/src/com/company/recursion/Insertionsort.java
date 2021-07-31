package com.company.recursion;

import java.util.Scanner;

class Insertionsort {
    public static void insertionSortDescending(int array[]) {
        for(int i=1;i<array.length;i++){
            int pivot=array[i];
            int j = i-1;
            while(j>=0 && pivot>array[j]){
                array[j+1]=array[j];
                j--;
            }array[j+1]=pivot;


        }
        for(int ele:array){
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   int size = scanner.nextInt();
        int array[] = {2, 3, 1 ,0};
      /*  for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }*/
        insertionSortDescending(array);
    }
}