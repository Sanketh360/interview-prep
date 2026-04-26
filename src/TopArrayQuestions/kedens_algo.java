package TopArrayQuestions;

public class kedens_algo {

	public static void main(String[] args) {
		int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int ans = keden(arr);
		System.out.println(ans);

	}
	public static int keden(int[] arr) {
		int currantmax=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			currantmax = Math.max(arr[i],arr[i]+currantmax);
			max=Math.max(max, currantmax);
			
		}
		return max;

	}

}
