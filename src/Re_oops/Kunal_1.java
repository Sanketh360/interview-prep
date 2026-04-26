package Re_oops;

public class Kunal_1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Sanketh",96.0f);
		Student s2 = new Student(2,"varun",87.0f);
		
		System.out.println(s1.name);
		System.out.println(s2.name);


	}
}

class Student{
	int roll;
	String name ;
	float mark;
	
	Student(int roll , String name , float mark){	
		this.roll = roll;
		this.name = name;
		this.mark=mark;
	}
	
	Student(int roll , String name ){
		this.roll = roll;
		this.name = name;
	}
	
}