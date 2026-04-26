package Sort;

import java.util.Arrays;

public class Merge {
	public static void main(String [] args) {
		int [] arr = {55,66,335,76,78,33};
		merge(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void merge(int[] arr, int l,int r) {
		if(l<r) {
			int mid=l+(r-l)/2;
			merge(arr,l,mid);
			merge(arr,mid+1,r);
			sort(arr,l,mid,r);	
		}
	}
	public static void sort(int arr[],int l,int mid,int r) {
		int n1=mid -l +1;
		int n2 = r-mid;
		
		int[] larr = new int [n1];
		int[] rarr = new int [n2];
		for(int x=0;x<n1;x++) {
			larr[x]=arr[l+ x];	
		}
		for(int x=0;x<n2;x++) {
			rarr[x]=arr[mid+1+x];
			
		}
		int i=0;
		int j=0;
		int k=l;
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
		}
		while(j<n2) {
			arr[k]=rarr[j];
			j++;
			k++;
		}
}
}
