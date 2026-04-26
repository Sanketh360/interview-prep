package opps;

public class Son1 extends Man{

	int age ;
	@Override
	void career() {
		System.out.println("i am son");		
	}

	 @Override
	void partner() {
System.out.println("i like son");		
	}
	 
	 Son1(int age){
		 super(age);
		 this.age = age;
		 //super(age);
	 }
	 
	 

}
