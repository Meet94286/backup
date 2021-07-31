package com.company.string;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       /* char[] array = {65, 66, 67, 68};
      //  System.out.println(new String(array));
        String s = String.join("a","b","c","d");
      //  System.out.println(s);
        String A = "HELLO";
        String ans = "";
        for(int i = 0; i < A.length(); i++) {
            ans += (char)(A.charAt(i) + 32);
        }
      //  System.out.println(ans);
        char[] array = {'a', 'b'};
        String a = new String(array);
        String b = new String(new char[]{'a', 'b'});
     //   System.out.println(a.equals(b));
        String a1 = "meet Mehta is";
       // System.out.println(a1.replace('m','t'));
      //  System.out.println(a1.replace("meet","Mehta"));
        String [] arr =a1.split(" ");
        for (int i=0;i< arr.length;i++){
           // System.out.print(arr[i]+" ");
        }
        String s1 = Arrays.toString(arr);
        System.out.println(s1);*/
        //1. String is Anagram or not
      /*  String s1 = "late";
        String s2 = "talea";
        boolean a = isAnagram(s1,s2);
        System.out.println(a);
        String a1 = "applles";
        String a2 = "sapplle";
        boolean a3 = isRotation(a1,a2);
        System.out.println(a3);*/

        String s = "meet";
        String s1 = "meet";
        System.out.println(s==s1);
    }
    public static boolean isAnagram(String s,String s1){
        int [] arr = new int[26];
        s=s.toLowerCase();
        s1=s1.toLowerCase();

        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int temp= ch-97;
            arr[temp]++;
        }
        for (int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            int temp= ch-97;
            arr[temp]--;
        }
        for (int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static boolean isRotation(String s, String s1){
        // make onr string like "appleapple" so in every rotation string present in it.
        s=s.concat(s);
        return s.contains(s1);
    }
}
