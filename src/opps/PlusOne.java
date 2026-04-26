package opps;

public class PlusOne {
	
	
	
//	public static int[] plusOne(int[] digits) {
//		
//        
//    }
	public static void main(String [] args) {
		int digits[]= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		long ans = total(digits);
		//System.out.println(ans);
		//int[] a = plusOne(digits);
		//System.out.println(a);
	 
	
		
	}
	
	public  int[] plusOne(int[] digits) {
		long get =total(digits);
		long set=get;
		int count =0;
		long temp;
		
		while(get!=0) {
			temp=get%10;
			count++;
			get=get/10;
		}
		int [] ha = new int[count];
		for(int i=count-1;i>=0;i--) {
			ha[i]=(int) (set%10);
			set=set/10;
			
		}
		
        return ha;
    }
	
	
	
public static long total(int[] digits) {
		long n=0;
		long ans ;
		for(int i=0;i < digits.length;i++) {
			n=n*10+digits[i];
			System.out.println(n);
		}
		ans=n+1;
		return ans;
		
		
	}

}
