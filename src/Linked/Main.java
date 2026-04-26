 package Linked;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//
//        list.display();
//        
//        list.insertlast(33);
//        list.insertlast(78);
//        
//        list.display();
//        
//        list.midinsert(4, 23);
//       // list.midinsert(4,44);
//        list.display();
//        
//        list.deletef();
//        System.out.println(list.deletef());
//        list.display();
//        
//        
//        
//        System.out.println(list.deletelast());
//        list.display();
//
//        System.out.println(list.deletemid(1));
//        list.display();
//        System.out.println(list.find(23));
//       // System.out.println(list.size);
    	
    	
    	
//    	DL dlist = new DL();
//    	dlist.insertfist(1);
//    	dlist.insertfist(5);
//
//    	dlist.insertfist(6);
//    	dlist.insertfist(8);
//    	dlist.insertfist(15);
//    	dlist.insertfist(67);
//    	
//    	
//    	dlist.insertlast(77);
//    	
//    	dlist.display();
//    	//dlist.displayRev();
//    	
//    	
    	
//    	CL list = new CL();
//    	list.insert(1);
//    	list.insert(4);
//
//    	list.insert(16);
//    	list.insert(17);
//    	list.insert(81);
//    	list.insert(8);
//    	list.insert(9);
//    	list.insert(10);
//    	
//    	list.display();


    	

    	LL list1 = new LL();
    	LL list2 = new LL();
    	
    	list1.insert(1);
    	list1.insert(5);

    	list1.insert(7);
    	list1.insert(12);
    	list1.insert(14);
    	list1.display();

    	
    	
    	list2.insert(2);
    	list2.insert(4);
    	list2.insert(6);
    	list2.insert(10);
    	list2.insert(16);
    	list2.insert(19);
    	list2.display();

    	
    	LL ans = LL.mergeTwoLists(list1, list2);
    	//ans.display();




    }
    
}

