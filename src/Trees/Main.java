package Trees;

public class Main {
 public static void main(String[] args) {
		 
		 BST binary = new BST();
		 binary.insert(5);
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
		 System.out.println();


		System.out.println( binary.min());
		System.out.println( binary.max());
		
		System.out.println(binary.valid());
		 binary.inorder();
		 System.out.println();

		System.out.println(binary.hight());

		

	 }

}
