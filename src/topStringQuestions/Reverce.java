package topStringQuestions;

public class Reverce {

	public static void main(String[] args) {
		String str = "dcba";
		reverce(str);
		

	}
	public static void reverce(String str) {
		char[] arr=str.toCharArray();
		int s=0,e=arr.length-1;
		while(s<e) {
			char temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			e--;
			s++;
		}
		
		System.out.println(new String(arr));
		
	}

}
