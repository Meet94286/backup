package com.company.recursion;

import java.util.Arrays;
import java.util.Scanner;

class C3 {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int ascendingMerge[] = mergeBothInAscendingOrder(sortedArray1, sortedArray2);

        for (int i = 0; i < ascendingMerge.length; i++) {
            System.out.println(ascendingMerge[i]);
        }
    }


    private static int[] mergeBothInAscendingOrder(int arr1[], int arr2[]) {

        int[] mergedArray = new int[arr1.length + arr2.length];
        int pos = 0;
        int x = 0, y = 0, k = 0;
        while (x < arr1.length && y < arr2.length) {
            mergedArray[k++] = arr1[x] < arr2[y] ? arr1[x++] : arr2[y++];
        }
        while (x < arr1.length) mergedArray[k++] = arr1[x++];
        while (y < arr2.length) mergedArray[k++] = arr2[y++];
        return mergedArray;
    }

    //  Arrays.sort(mergedArray);
    private static int[] getArrayInput(int sizeArray, Scanner scanner) {
        int[] arr = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arr[i] = scanner.nextInt();
        }
      /*  for (int i=0;i<sizeArray;i++){
            for (int j=0;j<sizeArray-1;j++){

                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        return arr;
    }
}