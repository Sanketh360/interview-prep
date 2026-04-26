package TopArrayQuestions;

public class Subarray {
	public static void main(String[] args) {
		int arr[]= {2, 3, 1, 2, 4, 3};
		int k = 7;
		 sub(arr,k);
		System.out.println();

	}
	
	public static void sub(int [] arr,int k) {
		int start = 0; int minlen = Integer.MAX_VALUE,sum=0;
		for(int end=0;end<arr.length;end++) {
			sum+=arr[end];
			
			while(sum>=k) {
				minlen=Math.min(minlen,end-start+1);
				sum-=arr[start];
				start++;	
			}
		}
			
			if(minlen ==Integer.MAX_VALUE) {
				System.out.println("no sub array");
			}
			else {
				System.out.println("Smallest subarray length = " + minlen);
			}
			
			
			
			
			
		}
	}
	
	


