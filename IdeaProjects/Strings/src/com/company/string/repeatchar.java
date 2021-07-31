package com.company.string;

import java.util.*;

class repeatchar {
    private static int findFirstRepeatedChar(String str) {
        str = str.toUpperCase();
        char[] arr = str.toCharArray();
        int count=-1;
        HashSet<Character> h = new HashSet<>();
        for (int i=0; i<=arr.length-1; i++)
        {
            char c = arr[i];
            count++;

            if (h.contains(c))
                return i;

            else // Else add element to hash set
                h.add(c);
        }
        return -1;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "MADAM";
        int index = findFirstRepeatedChar(str);
        if (index != -1) {
            System.out.println(str.charAt(index));
        } else {
            System.out.println("NA");
        }
    }
}
