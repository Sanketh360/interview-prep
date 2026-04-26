package OOP;

public class StaticClass {
	public static void main(String[] args) {
		
	   Detail a = new Detail(22,"san"); 
		
		Detail b = new Detail(2,"var"); 
		
		Detail c =new Detail(b);
		
		System.out.println(a.age);
		System.out.println(b.age);
		System.out.println(c.age);




	}
}

class Detail{
	int age ;
	String name ;
	char grade ;
	
 Detail(int age , String name){
		this.age = age;
		this.name = name;
		
	}	
Detail(int age , String name,char grade){
	this.age = age;
	this.name = name;
	this.grade = grade;
	
}
Detail( Detail other){
	this.age = other.age;
	this.name = other.name;
	
}
Detail(){
	this(22,"haha");
}
}
