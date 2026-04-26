package Threads;


public class MyThreads extends Thread{
	
	public void run() {
	
			try {
				Thread.sleep(5000);
				
			}catch(Exception e){
				System.out.println(e);
			}
			
			System.out.println("hi , ");
		}
	public static void main(String[] args) throws InterruptedException {
		MyThreads t1 = new MyThreads();
		t1.start();
		t1.join();
		System.out.println("Hello");
		
		

	}

}
