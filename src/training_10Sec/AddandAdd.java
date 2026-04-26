package training_10Sec;

public class AddandAdd {

	public static void main(String[] args) {
		
		 int num  = 12345;
		 int n = num;
		 int sum = 0;
		int ans =  answer(n,sum);
		if(ans>10) {
			ans = answer( ans,sum );
		}
		System.out.println(n);
		System.out.println(ans);

		System.out.println(num/ans);
			
	}
	
	public static int answer(int n,int sum) {
		while(n!=0) {
			 int ans ;
			 int temp = n%10;
			 sum = sum+temp;
			 n=n/10;	 
		 }
		return sum;
		
	}

}
