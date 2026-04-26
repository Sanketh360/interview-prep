package opps;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	 Student s1 = new Student(12);
		s1=new Student(17);
		
		Student ran = new Student(s1);
		System.out.println(ran.name);

		
		
		s1.name="sanketh";
		
//		Student s2 = new Student();
//		
////		
//		
//		Student s3 = new Student();
//		s3.roll=44;
//		
//		
		//Student s4 = new Student(22);
////		
	System.out.println(s1.roll);
		
//		System.out.println(s2.roll+" "+s2.mark);
	System.out.println(s1.name);
	//System.out.println(s4.roll);
		
//		s1.greeting();
//		s2.greeting();
//		s3.greeting();
//		s1.change("sanketh");
		Student s7 = new Student();
		System.out.println(s7);
	

	}
}



class Student{
	int roll;
	String name;
	float mark;
	
	Student(int roll,String name,float mark){
		this.roll=roll;
		this.name="kottRY";
		this.mark=mark;
	}
	void greeting() {
		System.out.println("hello "+name);
	}
   void change(String newname) {
	 this. name = newname;
	  System.out.println(name);
  }
	Student(){
		this.roll=roll;
		this.name=name;
		this.mark=mark;
	}
//
	Student(int roll,int mark){
		this.roll=1;
		this.name=name;
		this.mark=mark;
	}
	Student(int roll){
		this.roll=roll;
		this.name="kk";
		this.mark=34;
	}
	
	
	Student(Student other){
		this.roll=other.roll;
		this.name=other.name;
		this.mark=other.mark;		
	}
	
	

}