package com.company.recursion;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static String decode(String baseString, String encodedMsg) {

        StringBuffer sb = new StringBuffer();
        String[] baseArray = baseString.split(" ");
        String[] words = encodedMsg.split("@");
        for (String word : words) {

            String[] characters = word.split(",");

            for (String character : characters) {
                String[] numbers = character.split("-");

                sb.append(baseArray[Integer.parseInt(numbers[0]) - 1].charAt(Integer.parseInt(numbers[1]) - 1));
            }
            sb.append(" ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = "meet";
        String B = "";
        decode(a,B);
    }
}
