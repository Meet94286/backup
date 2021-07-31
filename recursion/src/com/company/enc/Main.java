package com.company.enc;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int countFreq(int arr[],  int size, int num)
    {
       int count=0;
        size=0;
        int start=0;
        size= arr.length;
        int middle=(size+num)/2;

        if(arr[middle] == num){
            return count++;
        }
        if(arr[middle] < num ){
        countFreq(arr, size, middle-1);

        }
        else  {
        countFreq(arr, middle+1, num);
        }
return -99;
    }






        public static void main(String []args){
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






       /* Scanner sc = new Scanner(System.in);
        int n = 4,i;
        int[] arr = new int[n];

        int max = arr[0];

        int second = Integer.MIN_VALUE;
        for( i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            int temp = arr[i];
            if(temp>max){
                second = max;
                max = temp;}
                //second = max;}
            else if(temp<max){
                second = temp;

            }}
            System.out.println(max);


        System.out.println(second);
        int p = max*second;
        System.out.println(p);*/






