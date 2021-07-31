package com.company.string;

import java.util.*;
public class removechars {
    static String removeChars(String str, String secStr) {
        String s = "";
        str = str.toLowerCase();
        secStr = secStr.toLowerCase();
        if (secStr.length() > str.length()) {
            return "NA";
        } else if (str.equals(secStr)) {
            return "same";
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < secStr.length(); i++) {
                char c = secStr.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            for (int j = 0; j < str.length(); j++) {
                char c1 = str.charAt(j);
                if (!map.containsKey(c1)) {
                    s += c1;
                }
            }
            return s;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(removeChars(str1,str2));
    }
}