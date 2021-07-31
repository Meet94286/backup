package com.company.string;

import java.util.*;

class Node
{
    int key;
    Node left, right;

    public Node(int key)
    {
        this.key = key;
        left = right = null;
    }
}

class BinaryTree1 {
    Node root;

    // Creates a node with key as 'i'.  If i is root, then it changes
    // root.  If parent of i is not created, then it creates parent first


    // Utility function to do inorder traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key + " ");
        }
    }


    static class mostimilar {
        public static int mostsimilar(int[] parent) {
            for (int i = 0; i < parent.length; i++) {
                System.out.println(parent[i]);


            }
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int M;
            M = scan.nextInt();
            BinaryTree1 tree = new BinaryTree1();
            int[] parent = new int[M];
            for (int j = 0; j < M; j++) {
                parent[j] = scan.nextInt();

            }

            int result;
             result = mostsimilar(parent);
            System.out.println(result);

        }
    }
}
