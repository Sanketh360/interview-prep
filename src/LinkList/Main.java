package LinkList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LL list = new LL();
//		list.insertf(1);
//		list.insertf(2);
//
//		list.insertf(3);
//		list.insertf(4);
//		list.insertf(5);
//		list.insertf(6);
//		
//		list.display();
//		
//		list.insertl(2);
//		list.insertl(2);
//		list.insertl(3);
//		list.insertl(4);
//		list.display();
//		
//		list.insertm(40,3);
//		list.display();
//		
//		System.out.println(list.deletef());
//		list.display();
//		System.out.println(list.deletel());
//		list.display();
//		
//		
//		System.out.println(list.delete(2));
//		list.display();
		
		DLL dlist =  new DLL();
		dlist.insertf(1);
		dlist.insertf(2);

		dlist.insertf(3);

		dlist.insertf(4);
		dlist.insertf(5);
		dlist.insertf(6);
		
		dlist.display();
		
		dlist.displayrev();
		
		dlist.insertl(2);
		dlist.insertl(1);
		dlist.insertl(2);	
		dlist.display();
		
		System.out.println(dlist.getsize());
		
		dlist.insertmid(40, 4);
		dlist.display();

		



		

		



	}

}
