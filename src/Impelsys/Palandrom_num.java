package Impelsys;

import java.util.ArrayList;

public class Palandrom_num {

	public static void main(String[] args) {
		int num = 121 ;
		
		System.out.println(palan(num));

	}
	public static boolean palan(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		
		while(num!=0) {
			int temp = num%10;
			list.add(temp);
			num=num/10;
		}
		int s = 0;
		int l = list.size()-1;
		
		while(s<l) {
			if(list.get(s)==list.get(l)) {
				s++;
				l--;
			}
			else {
				return false;
			}
		}
		return true;	
	}

}

