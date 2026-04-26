package Linked;

public class CL {
	
	
	private Node head;
	private Node tail;
	
	public CL() {
		this.head=null;
		this.tail=null;
		
	}
	
	public void insert(int val) {
		Node node = new Node(val);
		if(head==null) {
			head=node;
			tail=node;	
			return;
		}
		tail.next=node;
		node.next=head;
		tail=node;
	}
	
	public void display() {
		Node node=head;
		if(head!=null) {
			do {
				System.out.print(node.val+"->");
				node=node.next;
				
			}while(node!=head);
		}
		System.out.print("HEAD");

	}
	

	private class Node{
		private int val;
		private Node next;
		
		private Node(int val) {
			this.val=val;
			
		}
		
	}
}
