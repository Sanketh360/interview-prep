package Threads;
import java.util.*;

public class ExceptionHandaling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a : ");
		int a = sc.nextInt();
		System.out.println("write b : ");

		int b = sc.nextInt();
		System.out.println("answer : ");

		System.out.println(divid(a,b));
		
	}
public static int divid(int a , int b) {
	try {
		return a/b;
	}catch(Exception e) {
		System.out.println(e);
	}
	return -1;
	
}
	
	
}
