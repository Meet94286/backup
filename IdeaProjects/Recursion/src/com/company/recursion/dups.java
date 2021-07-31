
package com.company.recursion;
import java.util.Scanner;

public class dups {
    Scanner m= new Scanner(System.in);
    public static int getComparisonsec(int[] arr, int num, int low, int high) {
        int count = 0;
        high = arr.length - 1;

        if (low > high) {
            return -1;
        }
        int mid = (low +  (high-low) / 2);

        if (low <= high) {

            if (arr[mid] == num) {
                return mid;
            }
         //   if (arr[mid] != num) {
                if (arr[mid] < num) {
                    return getComparisonsec(arr, num, mid + 1, high);
                } else if (arr[mid]>num){
                    return getComparisonsec(arr, num,mid-1, low);
                }
            }
        return -99;
    }




    static int getComparisons(int[] array, int key ) {
         int high = array.length-1;

        int ind =getComparisonsec(array, key, 0, high);
        return ind;


    }

    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(getComparisons(array, key));
    }
}




