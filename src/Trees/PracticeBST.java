package Trees;

public class PracticeBST {
	
	Node root;
	PracticeBST(){
		root = null;
	}
	class Node {
		int val;
		Node right;
		Node left;
		
		Node (int val){
			this.val=val;
			}
		
	}

	
	public void insert(int val) {
		root = insertrec(root,val);
	}
	
	public Node insertrec(Node root , int val) {
		if(root==null) {
			root = new Node(val);
			return root;
		}
		if(val<root.val) {
			root.left = insertrec(root.left,val);
			
		}
		else if(val>root.val) {
			root.right = insertrec(root.right,val);
			
		}
		return root;
	}
	
	void preorder() {
		preorderrec(root);
	}
	
	public void preorderrec(Node root) {
		if(root!=null) {
			
			System.out.print(root.val + " ");
			preorderrec(root.left);
			preorderrec(root.right);
			
		}
		
	}
	
	void inorder() {
		inorderrec(root);
	}
	
	public void inorderrec(Node root) {
		if(root!=null) {
			inorderrec(root.left);
			System.out.print(root.val + " ");
			inorderrec(root.right);
			
		}
		
	}
	
	
	void postorder() {
		postorderrec(root);
	}
	
	public void postorderrec(Node root) {
		if(root!=null) {
			postorderrec(root.left);
			
			postorderrec(root.right);
			System.out.print(root.val + " ");
			
		}
		
	}
	
	public static void main(String[] args) {
		PracticeBST bi = new PracticeBST();
		bi.insert(5);
		bi.insert(7);
		bi.insert(3);
		bi.insert(19);
		bi.insert(4);
		bi.insert(77);
		bi.insert(66);
		bi.insert(8);
		
		bi.inorder();
		System.out.println();
		bi.preorder();
		System.out.println();
		bi.postorder();




	
	}
	
		
}

