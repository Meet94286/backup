package com.company.recursion;

import java.util.*;

class SC2 {
    public int getComparisons(int[] inputArr, int key) {
      /*  int start=0;
       int  end=inputArr.length;
        int count = 0;
        int mid = (start+end)/2;

        if(inputArr[mid]==key){
            return count;
        }
        if (inputArr[mid] > key) {
            count++;
            search(inputArr, 0, mid - 1, key);
        }
        if (inputArr[mid] < key) {
            count++;
            search(inputArr, mid + 1, end - 1, key);
        }
        return count++;



    }
   public static int search(int [] arr, int start, int end, int key) {
       start = 0;
       end = arr.length;
       int count = 0;
       int mid = (start + end) / 2;
       if (arr[mid] == key) {
           return count;
       }
       if (arr[mid] > key) {
           count++;
           search(arr, 0, mid - 1, key);
       }
       if (arr[mid] < key) {
           count++;
           search(arr, mid + 1, end - 1, key);
       }
       return count;
   }*/

        int l=0;
        int h=inputArr.length-1;
        int count=0;
        while (l<=h){

            int mid=(l+(h-l)/2);
            if(key<inputArr[mid]){
                count++;
                h=mid-1;
            }else if(key>inputArr[mid]){
                count++;
                l=mid+1;
            }else {
                return count;
            }
        }
        return count;
    }







    public static void main(String args[] ) throws Exception {
        SC2  bs = new SC2 ();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getComparisons(array, key));
    }
}