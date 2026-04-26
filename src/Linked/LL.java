package Linked;

public class LL {
	
	private Node head;
	private Node tail;
	
	public int size;
	public LL() {
		this.size=0;
	}
	
	
	public void insert(int val) {
		Node node = new Node(val);
		node.next=head;
		head=node;
		
		if(tail==null) {
			tail=head;
		}
		size++;
		}
	
	public void insertlast(int val) {
		if(tail==null) {
			insert(val);
			return;
		}
		
		Node node = new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	
	
	public void midinsert(int index,int val) {
		
		 if (index < 0 || index > size) {
		        throw new IndexOutOfBoundsException("Invalid index: " + index);
		    }
		if(index==0) {
			insert(val);
			return;
		}
		if(index==size) {
			insertlast(val);
			return;
		}
//		if (index < 0 || index > size) {
//		    throw new IndexOutOfBoundsException("Invalid Index");
//		}

		
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
			
		}
		Node node = new Node(val,temp.next);
		temp.next=node;
		size++;
			
	}
	
	public int deletef() {
		int val=head.val;
		head=head.next;
		if(head == null) {
			tail=null;
		}
		size--;
		return val;
	}
	
	public int deletelast() {
		if(size<=1) {
			return deletef();
		}
		Node secend = get(size-2);
		int val=tail.val;
		tail=secend;
		tail.next=null;
		return val;
	}
	
	public int deletemid(int index) {
		if(index==0) {
			return deletef();
		}
		if(index==size-1) {
			return deletelast();
		}
		Node prev=get(index-1);
		int value = prev.next.val;
		prev.next=prev.next.next;
		return value;
		
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
	
	
	
	
	
	 public static LL mergeTwoLists(LL first, LL second) {
		 Node f = first.head;
		 Node s=second.head;
		 LL ans = new LL();
		 
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
			 ans.insertlast(s.val);
			 s=s.next;
			 
			 
		 }
		 while(f!=null) {
			 ans.insertlast(f.val);
			 f=f.next;
			 
			 
		 }
		 return ans;
		   
	    }
	
	
	public Node get(int index) {
		Node node = head;
		for(int i=0;i<index;i++) {
			node = node.next;
		}
		return node;
		
	
	}
	

	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	
	public class Node {
		private int val;
		private Node next;
		
		private Node(int val) {
			this.val=val;
		}
		
		private Node(int val,Node next) {
			this.val=val;
			this.next = next;
		}
		
		
		
			
		}
		
		
	}


