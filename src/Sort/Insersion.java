package Sort;

import java.util.Arrays;

public class Insersion {
	// The insertion sort method
    static void insertion(int[] arr) {
       
        for (int i = 1; i < arr.length; i++) {
            
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    
                    swap(arr, j, j - 1);
                } else {
                    
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] data = {9, 5, 1, 4, 3};
        System.out.println("Original array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        
        insertion(data);
        
        System.out.println("\nSorted array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
