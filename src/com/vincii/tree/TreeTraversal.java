package com.vincii.tree;

public class TreeTraversal {

    Node root;

    public TreeTraversal(){
        root = null;
    }

    public void printPreorder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printInorder(Node node){
        if(node == null){
            return;
        }

        printInorder(node.left);
        System.out.print(node.data);
        printInorder(node.right);
    }

    public void printPostOrder(Node node){
        if(node == null){
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data);
    }
}


