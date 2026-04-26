package Test;

public class Student extends Person{
	int weight;
	
	
	Student(int height,int width,int weight ){
		super( height, width);
		this.weight=weight;
		
	}

	Student(int height,int width ){
		super( height, width);
		//this.weight=weight;
		
	}

}


