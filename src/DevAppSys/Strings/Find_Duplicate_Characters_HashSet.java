package DevAppSys.Strings;

import java.util.Arrays;
import java.util.HashSet;

public class Find_Duplicate_Characters_HashSet {
	public static void main(String[] args) {
	String name = "programming";
	System.out.println(Arrays.toString(find(name)));

}
	public static char[] find(String name) {
		HashSet <Character> set = new HashSet<>();
		HashSet <Character> dup = new HashSet<>();

		
		char[] arr = name.toCharArray();
		for(char n : arr) {
			if(!set.contains(n)) {
				set.add(n);
			}
			else {
				dup.add(n);
			}
		}
		
		char ans[] = new char[dup.size()];
		int i = 0;
		for(char n:dup) {
			ans[i]=n;
			i++;
		}
		return ans;	
	}
	
}
