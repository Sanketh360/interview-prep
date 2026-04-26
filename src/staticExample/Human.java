package staticExample;

public class Human {
	double height =0;
	String name;
	double width ;
	private static int population;
	double redius;
	
	
	 void message() {
		System.out.println("hello");		
	}
	 
	 void area() {
			//double area = height*width;
			System.out.println(height*width); 
		}
	 
	 double carea() {
		 return Math.PI*redius*redius;
	 }
	 
	 double cdiameter() {
		
		 return 2*redius;
	 }
	 
	Human(double height,double redius,double width){
		this.height=height;
		this.redius=redius;
		this.width=width;
		Human.population+=1;
	    this.area();
	}
	
	Human(Human other){
		this.height=other.height;
		this.redius=other.redius;
		this.width=other.width;
	}
	
	
	Human(double h,double w){
		this.height=h;
		this.name=name;
		this.width=w;
		this.area();
	}
	
	
	Human(){
		this.height=height;
		this.name=name;
		this.width=width;
		this.area();
	}
	
	Human(double redius){
		this.height=height;
		this.redius=redius;
		this.width=width;
		
		
	}
	
	Human (String name){
		this.name= name;
	}

	static double  div() {
		int a = 6;
        int b = 3;

        double result = -((a < 0 ? -a : a) / (b < 0 ? -b : b) * 1.0);
        return result;

	}
	

	
	
	}


