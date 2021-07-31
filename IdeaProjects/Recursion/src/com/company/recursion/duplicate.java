package com.company.recursion;
import java.util.HashMap;
import java.util.Scanner;

public class duplicate {
    static int countFreq(int arr[], int size, int num) {

            size = arr.length;
            int start = 0;
            int middle = (start + size) / 2;
            int count = 0;
            int m = 0;
            int mid = 0;

           /* if (arr[middle] != num) {
                if (start < size) {
                    while (arr[start] != num) {
                        start++;
                    }
                }
                return 0;

            }*/

            if (arr[middle] == num) {
               middle=mid;
            } else {

                return 1;
            }


            if (m == 1) {
                int r = mid - 1;
                while ((r >= 0) && (arr[r] == num)) {
                    m++;
                    r--;
                }
            }
            if (m == 1) {
                int s = mid + 1;
                while ((s <= size - 1) && (arr[s] == num)) {
                    m++;
                    s++;
                }
            }
            if ((arr[middle] == num) || ((arr[middle] != num) && (arr[middle] < num))) {
                //right
                start = middle + 1;
                countFreq(arr, size, num);
            } else if ((arr[middle] == num) || ((arr[middle] != num) && (arr[middle] > num))) {
                start = 0;
                //size = mid - 1;
                countFreq(arr, mid-1, num);
            }

            return m;
    }






        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        int freq = countFreq(arr, size, num);
        if (freq != 0)
            System.out.print(freq);
        else
            System.out.print("NA");
    }
    }

