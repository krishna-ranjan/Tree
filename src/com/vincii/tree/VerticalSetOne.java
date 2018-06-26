package com.vincii.tree;

public class VerticalSetOne {
    Node root;
    int min = 0;
    int max = 0;

    public VerticalSetOne(){
        root = null;
    }

    public void findMinMax(Node node,int hd) {
        if (node == null) {
            return;
        }

        if (hd < min) {
            min = hd;
        } else if (hd > max) {
            max = hd;
        }

        findMinMax(node.left, hd - 1);
        findMinMax(node.right, hd + 1);
    }

    public void printVerticalLine(Node node,int lineNo,int hd){
        if(node == null){
            return;
        }

        if(hd == lineNo){
            System.out.print(node.data + " ");
        }

        printVerticalLine(node.left,lineNo,hd-1);
        printVerticalLine(node.right,lineNo,hd+1);
    }

    public void printVerticalOrder(Node node){
        findMinMax(node,0);

        for(int lineNo = min; lineNo<=max; lineNo++){
            printVerticalLine(node,lineNo,0);
            System.out.println();
        }
    }
}
