package com.coding.excercise.graph;

import java.util.Iterator;
import java.util.LinkedList;

//this graph represent a directed graph using adjacent list representation
public class Graph {

	private int V; //no. of vertex;
	LinkedList<Integer> adj[];

	//Constructor
	Graph(int v){
		V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]= new LinkedList();
		}
	}
	
	//Function to add an edge into graph 
	void addEdge(int v,int e) {
		adj[v].add(e);
	}
	
	//Function to Print graph 
	void printGraph(Graph g) {
		
		for(int i=0;i<g.V;i++){
			System.out.print("Vertex="+i+" | Edges--> ( ");
			for(int j=0;j<g.adj[i].size();j++){
				System.out.print(g.adj[i].get(j)+" ");
			}
			System.out.print(")");
			System.out.println("");
		}
	}
	
	
	void BFS(int s) {

		// initialize a boolean arrat visted with Graph size
		boolean[] visited = new boolean[V]; 
		
		// Create a queue for BFS
		LinkedList<Integer> q= new LinkedList<Integer>();
		
		//Mark the current node as visited and enqueu it
		visited[s]= true;
		q.add(s);
		
		
		while(q.size()!=0) {
		
			// Dequeue a vertex from queue and print it
			s = q.poll();
			System.out.println(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n]=true;
					q.add(n);
					
				}
				
			}
					
					
		}
		
	}
	
	/*
	 * Given a directed graph, check whether the graph contains a cycle or not. Your function should return true if the given graph contains at least one cycle, else return false.
	Example, 
	
	Input: n = 4, e = 6
	0 -> 1, 0 -> 2, 1 -> 2, 2 -> 0, 2 -> 3, 3 -> 3
	Output: Yes
	Explanation:
	Diagram:
	
	The diagram clearly shows a cycle 0 -> 2 -> 0
	Input:n = 4, e = 4
	0 -> 1, 0 -> 2, 1 -> 2, 2 -> 3
	Output:No
	Explanation:
	*/
	
	
	void DFS(int s) {

		// initialize a boolean arrat visted with Graph size
		boolean[] visited = new boolean[V]; 
		
		DFSUtil(s, visited);
		
		
	}
	
	void DFSUtil(int s, boolean visited[]) {

		// Create a queue for BFS
		LinkedList<Integer> q= new LinkedList<Integer>();
		
		//Mark the current node as visited and enqueu it
		visited[s]= true;
		System.out.println(s+" ");
		
		//REcurrension for all the vertics adjacent to this vertex
		Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n]=true;
					DFSUtil(n,visited);
					
				}
				
			}
		
	}



	public static void main(String arg[]) {
		
        
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        
        g.printGraph(g);
        
        g.BFS(2);
        
        System.out.println("BFS End");

        
        System.out.println("Following is Depthe First Traversal "+
                "(starting from vertex 2)");
        
        g.DFS(2);
        
        System.out.println("DFS End");

        //printArray(arr);
	}
}
