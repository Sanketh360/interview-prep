package OOP;

import java.util.Arrays;

public class Objectes_Java {
	int num;
	char ch ;
	Detail a;
	
	Objectes_Java(int num,char ch){
		this.num=num;
		this.ch = ch;
		
	}
	
	 class Detail{
			int age ;
			String name ;
			
		Detail(int age , String name){
				this.age = age;
				this.name = name;
				
			}	
		}
	
	
	public static void main(String[] args) {
		Objectes_Java outer = new Objectes_Java(1,'A');
	    outer.a = outer.new Detail(22,"san");
		System.out.println(outer.num);
		
	}
		
}

