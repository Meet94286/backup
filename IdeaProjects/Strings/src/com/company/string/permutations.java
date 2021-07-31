package com.company.string;

import java.util.*;
public class permutations {
    public static  void stringPermutations(String str, int left, int right) {
        if (left == right)
            System.out.println(str);
        else
        {
            for (int i = left; i <= right; i++)
            {
                str = swapString(str,left,i);
               stringPermutations(str, left+1, right);
               // str = swapString(str,left,i);
            }
        }
    }
    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "bed";
        int len = str.length();
        if(len <= 3)
            stringPermutations(str,0,len-1  );
        else
            System.out.print("NA");
    }
}