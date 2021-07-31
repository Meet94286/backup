package com.company.enc;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* String A= "ab1";
        printPrmutn(A, " ");
	// write your code here
    }
    static void printPrmutn(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + "");
        }
        for(int i = 0; i<=str.length()-1;i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            printPrmutn(ros,ans + ch);

        }*/


Scanner input = new Scanner(System.in);
int n = input.nextInt();
int i, m = 0;
        int[] numberArray = {1,15,90,40,35,63,79,88,20};
        for(i=0;i<=8;i++){
             m = numberArray[i];
             while (m == n){
                 m =(numberArray[i]);
                 i++;
             }}
        System.out.println(i);}}



