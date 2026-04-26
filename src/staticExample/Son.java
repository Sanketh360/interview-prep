package staticExample;

public class Son extends Human {
	int age;
	
	private Son(int age){
		super();
		this.age=-1;
		}
	
	
	Son(double height,double redius,double width,int age){
		super(height,redius,width);
		
		this.height=height;
		this.redius=redius;
		this.width=width;
		//Human.population+=1;
	    this.area();
	}
	
	Son(double height,double redius){
		this.height=height;
		this.redius=redius;
	}
	
	
	void display () {
		System.out.println("i am son");
		System.out.println(height);
		System.out.println(redius);

	}
	
	
	

}
