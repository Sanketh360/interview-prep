package Intrest.String_Question;

public class Buy_Sell {

	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
		System.out.println(buysell(arr));

	}
	public static int buysell(int[] arr) {
		
		int minprofit = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for(int a :arr) {
			if(a < minprofit) {
				minprofit = a;
			}
			maxprofit=Math.max(maxprofit, a - minprofit);
		}
		
		
		
		return maxprofit;
		
	}

}
