package topStringQuestions;

public class palandrom {

	public static void main(String[] args) {
		String str = "malayalam";
		boolean ans = palan(str);
		System.out.println(ans);

	}
	public static boolean palan(String str) {
		int s=0,e=str.length()-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
		
		
	}
	
	

}
