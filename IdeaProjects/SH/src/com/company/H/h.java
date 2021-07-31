package com.company.H;

import java.util.*;

public class h {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = "meet";
        int k = 2;
        kthNonRepeatingCharacter(str, k);
    }

    // Method to find the kth non-repeating character in the string
    static void kthNonRepeatingCharacter(String str, int k) {
        int count = 0;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }


       // System.out.println(s);

    }
}




