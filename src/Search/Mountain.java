package Search;

public class Mountain {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,5,5,5,7,9,7,6,5};
		int ans = mount(arr);
		System.out.println(ans);
		
	}
	public static int mount(int[] arr) {
	    int s = 0;
	    int e = arr.length - 1;

	    while (s < e) {
	        int mid = s + (e - s) / 2;

	        if (arr[mid] <= arr[mid + 1]) {
	            s = mid + 1;  
	        } else {
	            e = mid;    
	        }
	    }
	    return s;  
	}

}
