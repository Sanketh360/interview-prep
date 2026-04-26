package LinkList;

public class DLL {
	private Node head;
	private Node tail;
	 int size;
	 
	 DLL(){
		 this.size=0;
	 }
	
	 
	 public int getsize() {
		 return size;
	 }
	 
	 
	 public void insertf(int val) {
		 Node node = new Node (val);
		 
		 
		 node.next=head;
		 node.prev=null;
		 
		 if(head!=null) {
			 head.prev=node;
		 }
		 head=node;
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
	 
	 
	 public void displayrev() {
		 Node temp=head;
		 Node last=null;
		 while(temp!=null) {
			 last=temp;
			
			 temp=temp.next;
		 }
		 
		 
		 while(last!=null) {
			 System.out.print(last.val+"->");
			 last=last.prev;
		 }
		 System.out.println("START");
	 }
	 
	 
	 public void insertl(int val) {
		 Node node = new Node(val);
		 Node temp = head;
		 Node last=null;
		 while(temp!=null) {
			 last=temp;
			 temp=temp.next;
		 }
		 
		 last.next=node;
		 node.prev=last;
		 node.next=null;
		 
		 if(head==null) {
			 insertf(val);
			 
		 }
		 size++;
	 }
	 
	 
	 
	 public void insertmid(int val, int index) {
		 if(index==0) {
			 insertf(val);
			 return;
		 }
		 if(index==size) {
			 insertl(val);
			 return;
		 }
		 Node temp=head;
		 Node last=null;
		 for(int i=1;i<index;i++) {
			 last=temp;
			 temp=temp.next;	 
		 }
		 Node node = new Node(val);
		 node.next=temp.next;
		 temp.next.prev=node;
		 temp.next=node;
		 node.prev=temp;
		  size++;		 
		 
	 }
	 
	 
	 public int deletef() {
		 if(head==null) {
			 System.out.println("empty");
		 }
		 
		 int val = head.val;
		 
		 head=head.next;
		 if(head!=null) {
			 head.prev=null;
		 }
		 else {
			 tail=null;
		 }
		 
		
		 size--;
		 return val;
	 }
	 
	 
	 
	 public int deletel() {
		 if(head==null) {
			 System.out.println("empty");
		 }
		 
		 
		 Node temp  = head;
		 while(temp!=null) {
			 temp=temp.next;
		 }
		 int val = temp.val;
		 
		 
		 temp=temp.prev;
		 
		 if(head!=null) {
			 temp.prev.next=null;
		 }
		
		 
		
		 size--;
		 return val;
	 }
	 
	 
	 
	private class Node{
		int val;
		Node next;
		Node prev;
		Node(int val){
			this.val=val;
			
			
		}
		Node (int val,Node next,Node prev){
			this.val=val;
			this.next=next;
			this.prev=prev;
		}
	}


	 

}
