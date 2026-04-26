package topStringQuestions;

public class CountWordesInSentence {

	public static void main(String[] args) {
		String str = "I Lke foods and i like more foods";
		System.out.println(count(str)); 
			
	}
	public static int count(String str) {
		int count=1;
		for(char c:str.toCharArray()) {
			if(c == ' ') {
				count++;
			}
			
			
		}
		
		return count;
		
	}

}
