package com.company.recursion;

public class sort012 {

    public static void main(String[] args) {
        int a[] = {1, 2, 1, 1, 2, 0, 0, 2, 1, 0, 0, 0, 0, 0,};
        ;
//        System.out.println(a.toString());
        sort012(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void sort012(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    int temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:

                    int temp1 = a[mid];
                    a[mid] = a[high];
                    a[high] = temp1;
                    high--;
                    break;
            }
        }

    }
}