package Graphs;

import java.util.Scanner;

public class Binarytree {
	Binarytree(){
		
	}

	private class Node{
		int val;
		Node right;
		Node left;
		
		Node(int val){
			this.val=val;
			
		}
	}
	Node root;
	public void populate(Scanner sc) {
		System.out.println("Enter the root node");
		int val = sc.nextInt();
		 root=new Node(val);
		 populate(sc,root);
		
	}
	private void populate(Scanner sc,Node root) {
		System.out.println("Do you waht to place a NOde in the left of"+ root.val);
		boolean left = sc.nextBoolean();
		if(left) {
			System.out.println("Enter te val to left of"+ root.val);
			int value=sc.nextInt();
			
			root.left=new Node(value);
			populate(sc,root.left);
			

		}
		System.out.println("Do you waht to place a NOde in the right of"+ root.val);
		boolean right = sc.nextBoolean();
		if(right) {
			System.out.println("Enter te val to right of"+ root.val);
			int value=sc.nextInt();
			
			root.right=new Node(value);
			populate(sc,root.right);
			

		}
		
		
		
	}
	
	
	
	
	
	public void display(Node root,int level) {
		if (root ==null) {
			return ;
		}
		display(root.right,level+1);
		
		if(level!=0) {
			for(int i=0;i<level-1;i++) {
				System.out.print("|\t\t");
			}
			System.out.println("|------->"+root.val);
			
		}else {
			System.out.println(root.val);
		}
		display(root.left,level+1);

	}
	public void display() {
		display(root,0);
		}
	}











