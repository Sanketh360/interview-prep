package topStringQuestions;

import java.util.Stack;

public class RemoveDupWith3Element {


		public static void main(String[] args) {
			String str = "deeedbbcccbdaa";
			int k=3;
			System.out.println(dup(str,k));
			

		}
		
		public static String dup(String str,int k) {
			StringBuilder sb = new StringBuilder();
			int len = sb.length();
			
			for(char c : str.toCharArray()) {
				if(len>0 && sb.charAt(len-1)==c && sb.charAt(len-2)==c) {
					sb.deleteCharAt(len-1);
					sb.deleteCharAt(len-2);
					
				}
				else {
					sb.append(c);
				}
				
			}
			return sb.toString();
			
	}


}
