package practice;

import java.util.*;

public class ListOfArrayList {
    public static void main(String[] args) {
        int arr[] = {-1, -2, 1, 2, 3};

        ArrayList<ArrayList<Integer>> output = sub(arr);
        System.out.println(output);
    }

    public static ArrayList<ArrayList<Integer>> sub(int[] arr) {
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;

        // Step 1: Find minimum difference between consecutive elements
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            minDiff = Math.min(minDiff, diff);
        }

        // Step 2: Collect all pairs with that minimum difference
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff == minDiff) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                result.add(pair);
            }
        }
        return result;
    }
}
