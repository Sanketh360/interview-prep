package DevAppSys.Strings;

public class Count_Vowels_and_Consonants {

	public static void main(String[] args) {
		String name = "Interview";
		int [] arr = count(name);
		System.out.println("vowel : " +arr[0]);
		System.out.println("Consonants : " +arr[1]);

		

	}
	
	public static int[] count(String name) {
		name = name.toLowerCase();
		int countv=0;
		int countc=0;
		char[] c = name.toCharArray();
		for(int n : c) {
			if(n>= 'a' && n<='z' ) {
			if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u') {
				countv++;
			}
			else
				countc++;	
		}
		}
		int arr[] = new int[2];
		arr[0]=countv; arr[1]=countc;
		
		return arr;
	}

}
