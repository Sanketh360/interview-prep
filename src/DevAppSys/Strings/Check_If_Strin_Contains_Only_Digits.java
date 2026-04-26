package DevAppSys.Strings;

public class Check_If_Strin_Contains_Only_Digits {

	public static void main(String[] args) {
		String num = "123o45";
		
		System.out.println(digits(num));
		

	}
	
	public static boolean digits(String num) {
		char[] arr = num.toCharArray();
	    boolean flag = true;
		for(char c  : arr) {
			if(c=='0' || c=='1' ||  c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9') {
				flag = true;
			}
			else {
				return false;
			}
		}
		
		return true;
		
	}

}
