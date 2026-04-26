package OOP;

import java.util.Arrays;

public class AcccessMod {
	
	private int num;
	private String name;
	int [] arr;
	
	
	
	AcccessMod(int num , String name){
		this.num=num;
		this.name=name;
		this.arr=new int[num];
	
	}
	
	public void setter(int num) {
		this.num = num;
	}
	
	
	public int getter() {
		return num;
	}

	public static void main(String[] args) {
		AcccessMod a = new AcccessMod(22,"nams");
		a.arr[0]=22;
		
	System.out.println(Arrays.toString(a.arr));
		

	}

}
