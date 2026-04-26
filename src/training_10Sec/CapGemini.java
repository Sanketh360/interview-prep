package training_10Sec;
import java.util.Scanner;

public class CapGemini {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 9;
		
//		int n = sc.nextInt();
//		if(n<1) {
//			System.out.println(-1);
//		}
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i] = sc.nextInt();
//			
//		}
		
		int [] arr = {2,3,4,5,7};
		int n=5;
		
		System.out.println(towsum(arr,sum));
	}
	public static int towsum(int[] arr,int sum){
		int min = arr[0];
		int smin = arr[1];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				smin=min;
				min=arr[i];
			}
			
			
		}
		System.out.println(min);
		System.out.println(smin);

		
		
		int ans = min+smin;
		
		if(ans<sum) {
			return min*smin;
		}
		
		return 0;
	}

	

}
