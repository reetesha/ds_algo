package com.gfg;

public class BinaryTree {

	Node root;
	
	BinaryTree(int key){
		root = new Node(key);
	}
	BinaryTree(){
		root = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree= new BinaryTree();
		
		//Create root
		tree.root= new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		

	}
}

class Node{
		int key;
		Node left;
		Node right;
		public Node(int data) {
			left= right = null;
		}
}

