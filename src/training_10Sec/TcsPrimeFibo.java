package training_10Sec;

public class TcsPrimeFibo {
	public static void main(String[] args) {
		int n= 6;
		int num=2;
		int count = 0;
		int f=1;
		int s =1;
		
		while(count<n) {
			if(isPrime(num)) {
				System.out.print(num+" ");
				count++;
				int []fibo = isFibo( f,s);
				f=fibo[0];
				s = fibo[1];
			}
			num++;	
		}
	}
	
	
	public static boolean isPrime(int num) {
		if(num<2) return false;
		
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;		
			}
		}
		return true;
	}
	
	
	
	public static int[] isFibo(int f , int s) {
		System.out.print(f+" ");
		int ans = f+s;
		f=s;
		s=ans;
		return new int[] {f,s};	
	}
}
