package DevAppSys.Strings;

public class Password_Strength_Scoring {

	public static void main(String[] args) {
		String pass ="sanketh1234";
		System.out.println(score(pass));

	}
	
	public static int score(String pass) {

		int score = 0;
		
		if(pass.matches(".*[A-Z].*")) {
			score+=2;
		}
		if(pass.matches(".*[a-z].*")) {
			score+=2;
		}
		if(pass.matches(".*[0-9].*")) {
			score+=2;
		}
		if(pass.matches(".*[!@#$%^&*].*")) {
			score+=2;
		}
		if(pass.length()>=8) {
			score+=2;
		}
		
			
		return score;
	
		
	
	}
	 

}
