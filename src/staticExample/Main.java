package staticExample;

public class Main {
	public static void main(String [] args) {
		//Human h4 = new Human();
		
		System.out.println(Human.div());
		
		
		System.out.println("Square area");
		Human h1 = new Human(7.0,2.0,7.0);
		System.out.println(h1.height);
		//Human.population=3;

		
		System.out.println("circle area and circle diameter");

		Human h2 = new Human(h1);
		System.out.println(h2.height);
		
		
		
		Son son = new Son(2,3,4,5);
		son.message();
		
		
		
		
//		System.out.printf("area : %.3f ",h2.carea());
//		Human h3 = new Human(7);
//
//		System.out.println("diameter :"+" "+h3.cdiameter());
		
		//System.out.println(h1.area());
//		Human h2 = new Human(22,"kottary",12364);
//		Human h3 = new Human(22,"ani",12364);
//		Human h5 = new Human(22,"nav",12364);
		
		//System.out.println(" "+h5.name+" "+h5.width);

		//h1.name="";
		//System.out.println(h1.name);
		//h1.name="kk";
		
//		System.out.println(Human.population);
//		System.out.println(Human.population);
//		System.out.println(Human.population);
	
	}
	static void america() {
		System.out.println("i am fum");
		
		Main obj = new Main();
		
		obj.india();
	}

	 void india() {
		System.out.println("i am greeting");
		america();

	}

}
