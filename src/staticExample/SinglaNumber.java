package staticExample;

public class SinglaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,1,2,4,4,5};
		//System.out.println(3);

		
		singleNumber(nums);
		int ans=singleNumber( nums);
		System.out.println(ans);

	}
public static int singleNumber(int[] nums) {
	for(int i=0;i< nums.length;i++) {
		if(firstIndexOf(nums,nums[i])==lastIndexOf(nums,nums[i])) {
			return nums[i];
			
		}
	}
	return -1;
        
    }
public static int firstIndexOf(int []nums,int val) {
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==val) {
			return i;
		}
	}
	return -1;
		
}
public static int lastIndexOf(int []nums,int val) {
	for(int i=nums.length-1;i>=0;i--) {
		if(nums[i]==val) {
			return i;
		}
	}
	return -1;
	
}


}
