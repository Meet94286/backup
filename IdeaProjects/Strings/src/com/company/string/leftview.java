package com.company.string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class representing Structure of node in the binary tree
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    public treeNode(int element) {
        data = element;
        left = null;
        right = null;
    }
}

//class used to print the left view of a binary tree
public class leftview {
    static treeNode rootNode;
    static int maxLevel = -1;

    public void leftView(treeNode node, int level){
        if(node==null){
            return;
        }
        if(maxLevel<level){
            System.out.println(node.data);
            maxLevel=level;
        }
        leftView(node.left,level+1);
        leftView(node.right,level+1);

    }


    public static void main(String args[]) {
        //creating a binary tree
        mostsimilar tree = new mostsimilar();

        //root node of the binary tree
        treeNode rootNode;

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element = 0;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary tree.
        rootNode = new treeNode(in.nextInt());
        q.add(rootNode);
        treeNode cur = null;
        int  sum = 0;
        for (int i = 1; i < n; i++) {

            cur = q.remove();
            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.left = new treeNode(element);
                q.add(cur.left);
                //System.out.println(cur.left.data);
            }
            i++;
            element = in.nextInt();
            //Note: if the element is -1 then the node is null
            if (element != -1) {
                cur.right = new treeNode(element);
                q.add(cur.right);
                sum+=cur.right.data;
               // System.out.println(sum);
            }
        }
        tree.leftView(rootNode,0);




    }
}
