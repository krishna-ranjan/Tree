package com.vincii.tree;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    int V;
    LinkedList<Integer>[] adjList;

    public DFS(int v){
        V = v;
        adjList = new LinkedList[v];

        for(int i = 0; i<V; i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int src,int dest){
        adjList[src].add(dest);
    }

    void DFsearch(int s){
        boolean[] visited = new boolean[V];
        DFsUtil(s,visited);
    }

    void DFsUtil(int s,boolean[] visited){
        visited[s] = true;
        System.out.print(s + " ");

        Iterator<Integer> i = adjList[s].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                DFsUtil(n,visited);
            }
        }
    }
}
