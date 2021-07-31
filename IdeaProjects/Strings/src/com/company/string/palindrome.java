package com.company.string;

import java.util.*;
public class palindrome {
    public static boolean isPalindrome(String str) {
        String s1 = "";
        str =str.toLowerCase();
        str=str.toUpperCase();
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(str.length()-1-i);
            s1+=c;
        }
        System.out.println(str);
        System.out.println(s1);
        if(str.equals(s1)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "MMadaMm";
        System.out.println(isPalindrome(str));
    }
}