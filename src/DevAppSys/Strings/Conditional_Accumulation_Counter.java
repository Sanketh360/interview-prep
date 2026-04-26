package DevAppSys.Strings;

public class Conditional_Accumulation_Counter {

	public static void main(String[] args) {
		int [] arr = {+5, +7, +2, -3, -5};
		System.out.println(counter(arr));
	}
	
	public static int counter(int[] arr) {
		
		int sum = Math.abs(arr[0]);
		int count = 0;
		
		
		for(int i=1;i< arr.length;i++) {
			int temp = sum + arr[i];
			
			if(temp>10) {
				continue;
			}
			
			sum=temp;
			
			if(sum<0) {
				break;
			}
			if(sum>=0) {
				count++;
			}	
		}
		return count;
		
	}
	
	

}
