package Linked;

//import Linked.LL.Node;

public class DL {
	
	
	private Node head;
	private Node tail;
	
	private int size=0;
	public DL() {
		this.size=size;
		
	}
	public void insertlast(int val) {
		Node node = new  Node(val);
		Node last=head;
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;
			
	}	
	
	public Node find(int value) {
		Node node = head;
		while(node!=null) {
			if(node.val==value) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
	
	
	public void insert(int after ,int val) {
		Node p=find(after);
		if(p==null) {
System.out.println("does not exist");	
return ;
}
		Node node = new Node(val);
		p.next=node;
		node.prev=p;
		node.next=p.next;
		if(node.next!=null) {
			node.next.prev=node;
		}
		
	}
	
	public void insertfist(int val) { 
		Node node  = new Node(val);
		node.next=head;
		if(head!=null) {
			head.prev=node;
		}
		
		node.prev=null;
		head=node;
		 if (tail == null) {
		        tail = head;
		    }
		size++;
	}
	
	
	

	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val + " ->");
			temp=temp.next;
		}
		System.out.print("End");
	}
	
	public void displayRev() {
        Node temp = tail;   // start from last node
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }
	
	
	
	private class Node{
		private int val;
		private Node next;
		private Node prev;
		
		private Node(int val){
			this.val=val;
		}
		private Node(int val,Node next,Node prev) {
			this.val=val;
			this.next=next;
			this.prev=prev;
		}
		
	}

}
