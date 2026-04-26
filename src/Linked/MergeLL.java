package Linked;

import Linked.LL.Node;

public class MergeLL {
	Node head;
	 Node tail;
	int size;
	MergeLL(int size){
		this.size=size;
	}
	MergeLL(){
		this.head=head;
		this.tail=tail;
	}
	
	
	public void insertlast(int val) {
		if(tail==null) {
			Node node = new Node(val);
			node.next=head;
			head=node;
			if(tail==null) {
				tail=head;
				
			}
			size++;
			return ;
		}
		Node node = new Node(val);
		tail.next=node;
		tail=node;
		size++;
		
	}
	
	
//	public void merge(Node first,Node second) {
//		Node f = first.next;
//		Node s = second.next;
//		
//		
//		
//		
//	}
	
	private class Node {
		int val;
		Node next ;
		Node(int val){
			this.val=val;
		}
		Node (int val,Node next){
			this.val=val;
			this.next=next;
		}
		
		
	}
	
	public static MergeLL merge(MergeLL first,MergeLL second) {
		Node f = first.head;
		Node s = second.head;
		
		MergeLL ans = new MergeLL();
		while(f!=null && s!=null) {
			if(f.val<s.val) {
				ans.insertlast(f.val);
				f=f.next;
				
			}else {
				ans.insertlast(s.val);
				s=s.next;
			}
		}
			while(f!=null) {
				ans.insertlast(f.val);
				f=f.next;
			}
			while(s!=null) {
				ans.insertlast(s.val);
				s=s.next;
			}
			
			
		
		return ans;	
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	
	public static void main(String [] args) {
		MergeLL first = new MergeLL();
		MergeLL second = new MergeLL();
		
		first.insertlast(4);
		first.insertlast(14);
		first.insertlast(42);
		first.insertlast(44);
		first.insertlast(66);
		
		second.insertlast(1);
		second.insertlast(1);
		second.insertlast(2);
		second.insertlast(54);
		second.insertlast(65);
		
		MergeLL ans  = MergeLL.merge(first, second);
		ans.display();
		


		
		

		
	}

}
