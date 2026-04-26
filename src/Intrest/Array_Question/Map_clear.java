package Intrest.Array_Question;
import java.util.*;

public class Map_clear {
	
	public static void main(String[] args) {
		
System.out.println(use());
	}
	
	
	
	
	public static HashMap<Integer , User> use(){
		
		HashMap<Integer , User> map = new HashMap<>();
		
		
		map.put(1, new User(1,"sank","hahah"));
		System.out.println();
		map.put(2, new User(2,"var","vvvvv"));
		System.out.println();
		map.put(3, new User(3,"ani","aaaaa"));
		System.out.println();

		map.put(4, new User(4,"nav","nnnnn"));

		
		return map;

	}
	
	
}
