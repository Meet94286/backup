package com.company.bst;

import java.util.*;

//class representing Structure of node in the binary tree
class treeNode {
    int data;
    treeNode left, right;

    treeNode(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class c2 {
    treeNode rootNode;

    public static boolean checkSym(treeNode rootNode){
        Queue<treeNode> q = new LinkedList<treeNode>();
        q.add(rootNode.left);
        q.add(rootNode.right);
        while (!q.isEmpty()) {
            treeNode l = q.remove();
            treeNode r = q.remove();

            if (l == null && r == null) {
                continue;
            }
            if (l == null && r != null || l != null && r == null) {
                return false;
            }
            if (l.data != r.data) {
                return false;
            }
            q.add(l.left);
            q.add(r.right);
            q.add(l.right);
            q.add(r.left);
        }
        return true;


        }



    public static void main(String[] args) {

        c2 binaryTree = new c2();

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary tree.
        binaryTree.rootNode = new treeNode(in.nextInt());
        q.add(binaryTree.rootNode);
        treeNode cur = null;
        for (int i = 1; i < n; i++) {

            cur = q.remove();

            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.left = new treeNode(element);
                q.add(cur.left);
            }
            i++;

            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.right = new treeNode(element);
                q.add(cur.right);
            }
        }
        System.out.println(checkSym(binaryTree.rootNode));

    }
}
