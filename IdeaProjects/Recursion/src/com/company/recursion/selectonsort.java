package com.company.recursion;
import java.util.Scanner;

class selectionsort {
    public static void iterations(int[] arr, int key) {
        int size= arr.length;
        for (int j = 0; j <=key-1; j++) {

            int MinIndex = j;
            int tempMin = arr[j];

            for (int k = j + 1; k < size; k++) {
                if (arr[k] < tempMin) {
                    tempMin = arr[k];
                    MinIndex = k;
                }
            }
            int temp = arr[j];
            arr[j] = arr[MinIndex];
            arr[MinIndex] = temp;
        }
        for (int ele:arr){
            System.out.println(ele);
        }
    }








    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = scanner.nextInt();
        }
        int i = scanner.nextInt();
        iterations(array, i);
    }
}