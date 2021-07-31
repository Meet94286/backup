package com.company.recursion;

import java.util.HashMap;
import java.util.Map;

public class countFREQ1 {
    static final int size=256;

    public static void countFreq(String s, char c) {

        int[] countFreq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            System.out.println(countFreq[s.charAt(i)-'a']);
            countFreq[s.charAt(i)-'a']++;}

            for (int j = 0; j < s.length(); j++) {


                if (countFreq[s.charAt(j)-'a'] != 0) {

                    System.out.print(s.charAt(j));
                    System.out.print(countFreq[s.charAt(j)-'a'] + " ");
                   countFreq[s.charAt(j)-'a'] = 0;
                }
            }
        }



    public static void main(String[] args) {
        String S = "geeksforgeeks";
        char c = S.charAt(0);
        countFreq(S, c);
    }
}