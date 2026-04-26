package TopArrayQuestions;

public class VeriableSizeWindow {

	public static void main(String[] args) {
		int [] arr = {1,1,1,1};
		int  k = 7;
		System.out.println(minSubArrayLen(k  ,arr));
		

	}
	
	 public static  int minSubArrayLen(int target, int[] nums) {
	        int left = 0;
	    
	        int sum  =0;
	        int minlen = Integer.MAX_VALUE;
	        


	        for(int i=0;i<nums.length;i++){
	            sum = sum+nums[i];
	            //left++;
	            
	            while(sum >= target) {
	                minlen = Math.min(minlen, i - left + 1);
	                sum -= nums[left];
	                left++;
	            }

	            
	           
	        }
	        
           // minlen = Math.min(minlen, i-left+1);
           return minlen == Integer.MAX_VALUE ? 0 : minlen;


	        
	    }
	

}
