package com.vincii.tree;

import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalSetTwo {

    Node root;

    public VerticalSetTwo(){
        root = null;
    }

    public void getVerticalOrder(Node node,int hd,TreeMap<Integer,Vector<Integer>> m){

        if(node == null){
            return;
        }

        Vector<Integer> get = m.get(hd);

        if (get == null) {

            get = new Vector<Integer>();
            get.add(node.data);
        }else{
            get.add(node.data);
        }

        m.put(hd,get);

        getVerticalOrder(node.left,hd-1,m);
        getVerticalOrder(node.right,hd+1,m);
    }

    public void printVerticalOrder(Node node){

        int hd = 0;
        TreeMap<Integer,Vector<Integer>> m = new TreeMap<Integer, Vector<Integer>>();
        getVerticalOrder(node,hd,m);

        for(Map.Entry<Integer,Vector<Integer>> entry : m.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
