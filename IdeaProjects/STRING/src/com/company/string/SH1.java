package com.company.string;

import java.util.*;
public class SH1 {
    static String removeCommonChar(String str1, String str2) {
        for(int i=0; i<str2.length(); i++){
            char c=str2.charAt(i);
            String s=String.valueOf(c);
            System.out.println(s+" s");
            str1=str1.replace(s,"");
            System.out.print(str1+"  ");
        }

        return str1;

            }


        //String a = "";





    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(removeCommonChar(str1, str2));
    }
}