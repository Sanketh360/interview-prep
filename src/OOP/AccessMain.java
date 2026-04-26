package OOP;

import java.util.Arrays;

public class AccessMain {
	
	

	public static void main(String[] args) {
		AcccessMod obj = new AcccessMod(10,"sky");
		System.out.println(obj.getter());
		obj.arr[1]= 33;
		System.out.println(Arrays.toString(obj.arr));
	
	}

}
