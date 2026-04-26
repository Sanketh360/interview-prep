package LinkList;

public class LL {
	private Node head;
	private Node tail;
	
	private int size;
	LL(){
		this.size=0;
	}
	
	
	public void insertf(int val) {
		Node node = new Node(val);
		
		node.next=head;
		head=node;
	
		
		if(tail==null) {
			tail=head;
			
		}
		size++;	
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
			
		}
		System.out.println("End");
		
	}
	
	public void insertl(int val) {
		if(tail==null) {
			insertf(val);
			return;
		}
		
		Node node = new Node(val);
		tail.next=node;
		tail=node;
		
		size++;
		
	}
	
	public void insertm(int val,int index) {
		if(index==0) {
			insertf(val);
			return;
		}
		if(index==size) {
			insertl(val);
			return;
		}
		
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}   
//		Node node = new Node(val,temp.next) ;
//		temp.next=node;
//		size++;
			
		Node node = new Node(val);
		node.next=temp.next;
		temp.next=node;
		size++;
		
			
	}
	
	public int deletef() {
		if(head == null) {
			tail=null;
			System.out.println("list is Empty");	
		}
		int val = head.val;
		head=head.next;
		size--;	
		return val;
		
	}
	
	
	public int deletel() {
		if(size<=1) {
			return deletef();
			
		}
		
		Node temp = head;
		for(int i=0;i<size-2;i++) {
			temp=temp.next;
		}
		int val=tail.val;
		tail=temp;
		tail.next=null;
		size--;
		
		return val;
		
	}
	public int delete(int index) {
		if(index==0) {
			return deletef();
			
		}
		if(index==size-1) {
			return deletel();
			
		}
		
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
			
		}
		
		int val = temp.next.val;
		temp.next=temp.next.next;
		size--;
		return val;
		
	}
	
	private class Node{
		private int val;
		private Node next;
		
		private Node(int val){
			this.val=val;
		}
		private Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
		
		
	}
	

}
