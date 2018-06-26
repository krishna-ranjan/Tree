package com.vincii.tree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //BFS g = new BFS(4);
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.DFsearch(2);

//        VerticalSetTwo tree = new VerticalSetTwo();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
//        tree.root.right.left.right = new Node(8);
//        tree.root.right.right.right = new Node(9);
//
//        //int min = tree.findMinMax(tree.root,0);
//        //System.out.println(min);
//        tree.printVerticalOrder(tree.root);

    }
}
	// write your code here
//        TreeTraversal tree = new TreeTraversal();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        System.out.println("PreOrder");
//        tree.printPreorder(tree.root);
//        System.out.println();
//
//        System.out.println("InOrder");
//        tree.printInorder(tree.root);
//        System.out.println();
//
//        System.out.println("PostOrder");
//        tree.printPostOrder(tree.root);
//        System.out.println();
//        public static void main (String[] args)
//        {
//            //code
//            Scanner scan = new Scanner(System.in);
//            int T = scan.nextInt();
//            int[] binary = new int[14];
//
//            for(int i = 0; i<T; i++){
//                int n = scan.nextInt();
//                bin(n);
//                System.out.println();
//            }
//
//        }
//
//        static void bin(int n){
//            //int mask = 1<<13;
//            for(int i = 1 << 13; i>0; i = i/2){
//                if((n & i) != 0){
//                    System.out.print(1);
//                }else
//                    System.out.print(0);
//
//                //mask = mask >>1;
//            }
//        }
//
//    }

