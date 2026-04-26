package Threads;

public class Hello {

	public static void main(String[] args) {
		World w = new World() ;
		w.start();
		
		for(;;) {
			System.out.println("Hello");
		}
			
		
	}

}
 