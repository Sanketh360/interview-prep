package Trees;

public class BST {
	Node root;
	BST(){
		root=null;
	}
	 
	public class Node{
		int val;
		Node right;
		Node left;
	
	Node(int val){
		this.val=val;
	}
	}
	
	 public void insert(int val) {
		 root=insertrec(root,val);
	 }
	 
	 public Node insertrec(Node root,int val) {
		 if(root==null) {
			 root=new Node(val);
			 return root;
		 }
		 if(val<root.val) {
			 root.left=insertrec(root.left,val);
		 }
		 else if(val>root.val) {
			 root.right=insertrec(root.right,val);

		 }
		 return root;
	 }
	 
	 void inorder() {
		 inorderec(root);
	 }
	 
	 public void inorderec(Node root) {
		 if(root!=null) {
			inorderec(root.left);
			System.out.print(root.val+" ");
			inorderec(root.right);	
		 }

		 
	 }
	 
	 
	 
	 void postorder() {
		 postorderrec(root);
	 }
	 
	public void postorderrec(Node root){
		if(root!=null) {
			postorderrec(root.left);
			postorderrec(root.right);
			System.out.print(root.val+" ");

			
		}
		 
	 }
	
	
	void preorder() {
		preorderec(root);
	}
	public void preorderec(Node root) {
		if(root!=null) {
			System.out.print(root.val+" ");
			preorderec(root.left);
			preorderec(root.right);	
		}
		
	}
	
	
	public boolean search(int key) {
		return searchrec(root,key);
	}
	
	boolean searchrec(Node root,int key) {
		if(root==null) {
			return false;
		}
		
		if(root.val==key) {
			return true;
		}
		if(key>root.val) {
			return searchrec(root.right,key);
		}
		else {
			return searchrec(root.left,key);
		}
		
	}
	
	
	public void delete(int val) {
		root= deleterec( root, val) ;
	}
		 
		 public Node deleterec(Node root,int val) {
			 if(root==null) {
				 return root;
			 }
			 
			 if(val<root.val) {
				 root.left=deleterec(root.left,val);
				 
			 }
			 else if(val>root.val) {
				 root.right=deleterec(root.right,val);

			 }
			 else {
				 if(root.right==null && root.left==null) {
					 return null;
				 }
				 else if(root.left==null) {
					 return root.right;
				 }
				 else if(root.right==null) {
					 return root.left;
				 }
				 
					 root.val=minval(root.right);
					 root.right=deleterec(root.right,root.val);
				 
			 }
			 return root;
			 
		 }
		 
		 public int minval(Node root) {
			 int minval=root.val;
			 while(root.left!=null) {
				 root=root.left;
				 minval = root.val;
			 }
			 return minval;
		 }
		 
		 
		 public int min() {
			 return minrec(root);
		 }
		 
		 public int minrec(Node root) {
			 int min = root.val;
			 while(root.left!=null) {
				 root=root.left;
				 min=root.val;
				 
			 }
			 return min;
		 }
		 
		 
		 public int max() {
			 //root.val=maxrec(root.right);
			 return maxrec(root);
					 
		 }
		 public int maxrec(Node root) {
			 int max=root.val;
			 while(root.right!=null) {
				 root=root.right;
				 max=root.val;
			 }
			 return max;
		 }
		 
		 
		 public boolean valid() {
			 return isvalid(root,Long.MIN_VALUE,Long.MAX_VALUE);
		 }
		 public boolean isvalid(Node root,long min,long max) {
			 if(root==null) return true;
			 if(root.val<=min || root.val>=max) return false;
			 else {
				 return isvalid( root.left, min,root.val) && isvalid( root.right, root.val,max);
			 }
				 
		 }
		 
		 
		 int hight() {
		 return hightrec(root);
		 }
		 public int hightrec(Node root) {
			 if(root==null) {
				 return -1;
			 }
			 
			 int hleft = hightrec(root.left);
			 int hright = hightrec(root.right);
			 
			 return 1+ Math.max(hleft, hright);

			 
		 }
	
	
	
	 public static void main(String[] args) {
		 
		 BST binary = new BST();
		// binary.insert(5);
		 binary.insert(9);
		 binary.insert(11);
		 binary.insert(2);
		 binary.insert(10);
		 binary.insert(4);
	
 
		 System.out.println();
		 binary.inorder();
		 System.out.println();

		 binary.preorder();
		 System.out.println();

		 binary.postorder();
		 System.out.println();
		 System.out.println(binary.search(10));	 
		 
		 binary.delete(9);
		 binary.inorder();

		System.out.println( binary.min());
		System.out.println( binary.max());
		
		System.out.println(binary.valid());
		 binary.inorder();
		 System.out.println();

		System.out.println(binary.hight());

		

	 }

}
