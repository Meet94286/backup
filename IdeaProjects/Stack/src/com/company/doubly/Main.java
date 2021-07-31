package com.company.doubly;


import java.util.Stack;

public class Main {

    public static boolean isValidExpr(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return false;
                }
                char c1 = stack.pop();
                if (c == '(' && c1 != ')') {
                    return false;
                }
                if (c == '{' && c1 != '}') {
                    return false;
                }
                if (c == '[' && c1 != ']') {
                    return false;
                }
            }

        }
        return true;
    }

    public static void reverse(stack s){
        if(!s.isEmpty()){
            int temp=s.pop();
            reverse(s);
            insertBottom(s,temp);


        }
    }
    public static void insertBottom(stack s, int n){
        if(!s.isEmpty()){
            s.push(n);
        }else {
            int temp=s.pop();
            insertBottom(s,n);
            s.push(temp);
        }
    }




    public static void main(String[] args) {

        Stack s = new Stack();
        s.isEmpty();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.peek();





    }
}
