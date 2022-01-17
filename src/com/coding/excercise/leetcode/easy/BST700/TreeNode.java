package com.coding.excercise.leetcode.easy.BST700;

	public class TreeNode{
		int val;
		TreeNode left,right;
		
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val=val;
			this.left=left;
			this.right=right;
		}
		
		TreeNode(){}

		TreeNode(int val){ this.val=val;}

		void InOrder(TreeNode node){
			if(node==null)return;
			InOrder(node.left);
			System.out.print(node.val+" ");
			InOrder(node.right);
			
		}
		
		public TreeNode searchBST(TreeNode root,int val){
			while (root!=null) {
				if(root.val==val) {
					return root;
				}
				if(root.val > val){
					root=root.left;	
				}
				else {
					root=root.right;
				}
			}
			
			return null;
		}

	
	public static void main(String arg[]) {
		
		
		TreeNode n1= new TreeNode(1,null,null);
		TreeNode n2= new TreeNode(3,null,null);
		
		TreeNode n3 = new TreeNode(2,n1,n2);
		
		TreeNode n4= new TreeNode(7,null,null);
		
		
		TreeNode root = new TreeNode(4,n3,n4);
		
		root.InOrder(root);
		
		TreeNode find= root.searchBST(root,2);
		System.out.print("Node = "+find.val+" "+find.left.val+" "+find.right.val);
		
		
		
		
	}
}