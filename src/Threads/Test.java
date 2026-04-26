package Threads;

public class Test {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Mthread t1 = new Mthread(counter);
		Mthread t2 = new Mthread(counter);
		Mthread t3 = new Mthread(counter);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t1.join();
			t3.join();

		}
		catch(Exception e){
			
			System.out.println(e);
		}
		System.out.println(counter.getcount());

		

	}

}
