package opps;

public class Now {
	public static void main(String [] args) {
		Son1 son = new Son1(22);
		son.career();
		Child child = new Child(66);
		child.career();
		
		Child c = new Child(444);
		
		
		System.out.println(c.age);
	}

}
