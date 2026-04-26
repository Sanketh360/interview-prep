package OOP;

public  class Inharitence {
	
	double l;
	double w;
	double h;
	double size;
	double den=10;
	
	

	Inharitence(){
		
	}
	
	Inharitence(Double side){
		this.l= side;
		this.h=side;
		this.w = side;
	}
	
	Inharitence(Double l,double h,double w,double size){
		this.l= l;
		this.h=h;
		this.w = w;
		
	}

	public static void main(String[] args) {
		
	Inharitence in = new Inharitence(4.2);
	System.out.printf("%.2f",in.l*in.h*in.w);
	System.out.println();
		
		Child c = new Child(2.2);
		System.out.printf("%.2f",in.l*in.h*in.w*c.weight);
		System.out.println();

		Child c1 = new Child(2.2,2.2,2.2,2.2);
		System.out.printf("%.2f",c1.l*c1.h*c1.w*c1.weight);
		
		Inharitence up = new Child(4.2,4.4,4.4,4.4);
		System.out.println(up.h);
		
		
		Child c2 = new Child(2.2,2.2,2.2,2.2);
		//System.out.println(this.weight);
	}
}
 class  Child extends Inharitence{
	double weight;
	//double den=20;

	 Child(Double weight) {
		this.h=h;
		this.l=l;
		this.w=w;
		this.weight=weight;
		this.den=den;
		double size;

		
	}
	 Child(Double weight,Double l,double h,double w) {
			//super(l,h,w);
			System.out.println(this.den);
			System.out.println(super.den);

			

		 this.l=l;
		 this.w=w;
		 this.h=h;
			this.weight=weight;
	
		}
}


