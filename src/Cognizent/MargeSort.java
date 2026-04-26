package Cognizent;

import java.util.Arrays;

public class MargeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = {5,3,6,98,1,6,77};
		int l = 0;
		int r  = arr.length-1;
		marge(arr,l,r);
		System.out.println(Arrays.toString(arr));

	}
	public static void marge(int [] arr,int l,int r) {
		if(l<r) {
			int m = l+(r-l)/2;
			marge(arr,l,m);
			marge(arr,m+1,r);
			sort(arr,l,m,r);
		}
	}
	
	public static int[] sort(int[] arr,int l,int m,int r) {
		int n1 = m-l+1;;
		int n2 = r-m;
		
		int [] larr = new int[n1];
		int [] rarr = new int[n2];
		
		for(int x = 0 ;x<n1;x++) {
			larr[x]=arr[x+l];
		}
		for(int x = 0 ;x<n2;x++) {
			rarr[x]=arr[m+1+x];
		}
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(larr[i]<=rarr[j]) {
				arr[k]=larr[i];
				i++;
			}
			else {
				arr[k]=rarr[j];
				j++;

			}
			k++;
		}
		while(i<n1) {
			arr[k]=larr[i];
			i++;
			k++;
		}while(i<n1) {
			arr[k]=rarr[j];
			j++;
			k++;
		}

		return arr;
	}

}
