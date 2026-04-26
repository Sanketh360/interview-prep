package SAP_code;

public class DccurenceWithBuffer {

	public static void main(String[] args) {
		String str = "aabbbbeeeeffggg";
		System.out.println(count( str));

	}
	public static String count(String str) {
		int count =1;
		StringBuffer s= new StringBuffer();
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
				
			}
			else {
				if(count <=1) {
					s.append(str.charAt(i-1));
				}
				else {
				s.append(str.charAt(i-1)).append(count);
				count=1;
				}
				
			}
			}
		
		if(count>1) {
			s.append(str.charAt(str.length()-1)).append(count);

		}
		else {
			s.append(str.charAt(str.length()-1));
		}
		
		
		return s.toString();
		}

}
