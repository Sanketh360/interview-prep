package Threads;

public class Mthread extends Thread {

	private Counter counter;
	
	public Mthread(Counter counter) {
		
		this.counter = counter;
	}
	
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			counter.increment();
		}
	}
}
