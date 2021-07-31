package com.company.recursion;

import java.util.*;

public class SH2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();
        kthNonRepeatingCharacter(str, k);
    }

    // Method to find the kth non-repeating character in the string
    static void kthNonRepeatingCharacter(String str, int k) {
        int INT_MAX = Integer.MAX_VALUE;
        int n = str.length();
        int[] frequency = new int[256];
        int[] index = new int[256];

        for (int i = 0; i < 256; i++) {
            frequency[i] = 0;
            index[i] = INT_MAX;
        }
        char c = '0';
        for (int i = 0; i < n; i++) {
            c = str.charAt(i);
            frequency[c]++;

            if (frequency[c] == 1)
                index[c] = i;
            else if (frequency[c] > 1)
                index[c] = INT_MAX;
        }
    Arrays.sort(index);

            if (index[k - 1] < INT_MAX)
                System.out.println(str.charAt(index[k - 1]));
            else {
                System.out.println("NA");

            }
        }
        }
