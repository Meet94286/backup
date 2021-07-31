package com.company.string;

import java.util.*;
public class reverse {
    public static String reverse(String str) {
        String s1 = "";
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(str.length()-1-i);
            s1+=c;
        }
       return s1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}




