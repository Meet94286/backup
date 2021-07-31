package com.company.recursion;
import java.util.Scanner;

public class unsuccessful {
    Scanner m= new Scanner(System.in);
    public static int getComparisonsec(int[] arr, int key, int low, int high) {
        if(low>high){
            return -1;
        }
        int count=0;
        int mid = low + ((high - low) / 2);
        if (arr[mid] == key) {
            return mid;


        } else if (key < arr[mid]) {
          // count++;

            return getComparisonsec(arr, key, low, mid - 1);
        } else {
          //  count++;

            return getComparisonsec(arr, key, mid + 1, high);
        }

            }
    static int getComparisons(int[] a, int key) {
        return getComparisonsec(a,key,0,a.length-1);
       /* int count = 0, low=0, high=a.length-1;
        int index = getComparisonsec(a, key, 0, a.length - 1);
        if(low>high){
            return -1;
        }


            low = index-1;
            while (low >= 0 && a[low] == key) {

                count++;

                low++;
                continue;
            }
            high=index+1;
            while (high < a.length - 1 && a[high] == key) {
                count++;
                high++;
                continue;
            }
            return count;*/

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