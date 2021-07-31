package com.company.doubly;
import  java.util.*;
public class C4 {
    public static class Node {
        private char data;
        private Node next;

        Node(char data) {
            super();
            this.data = data;
        }
        public char getData() {
            return data;
        }
        public void setData(char data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static class Stack<C> {
        Node head;
        public Stack() {
            super();
            head = null;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void push(char data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
        public char pop() {
            if (head == null) {
                return '\0';
            }
            char data = head.getData();
            head = head.getNext();
            return data;
        }
        public char peek()
        {
            if (!isEmpty()) {
                return head.data;
            }
            else {
                System.out.println(" ");
                return '\0';
            }
        }
    }
    public static String findDuplicateParenthesis(String inputString) {
        Stack<Character> Stack = new Stack<>();

        // Iterate through the given expression
      //  char[] str = inputString.toCharArray();
        for (int i=0;i<inputString.length();i++) {
            char ch=inputString.charAt(i);
            // if current character is close parenthesis ')'
            if (ch == ')') {
                // pop character from the stack
                char top = Stack.peek();
                System.out.println(Stack.pop()+" popped");
                Stack.pop();
               // System.out.println(Stack.pop()+" popped");

                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not
                int count = 0;
                while (top != '(') {
                    count++;
                    top = Stack.peek();
                    System.out.println(top);
                    Stack.pop();
                }
                System.out.println(count);
                if (count < 1) {
                    String string="present";
                    return string;

                }
            } // push open parenthesis '(', operators and
            // operands to stack
           // System.out.println(ch);
            else {
                System.out.println(ch+ " ch1");
                Stack.push(ch);
            }
        }

        // No duplicates found
        String string1="absent";
        return string1;
    }




/*

if(node.left==null||node.righ==null







*/

    public static void main(String[] args){
        C4 obj = new C4();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));
    }
}