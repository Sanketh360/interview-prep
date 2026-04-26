package opps;

public class Child extends Man{
int age;
	@Override
	void career() {
System.out.println("hi i am child");		
	}

	@Override
	void partner() {
System.out.println("i like child");		
	}
	
	
	 Child(int age) {
		 super(age);
		this.age = age;

}
}
