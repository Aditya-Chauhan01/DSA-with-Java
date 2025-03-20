package BinarySearch;

import java.util.ArrayList;
import java.util.List;
public class ClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {     // leetcode: 658
        int n = arr.length;
        int R = lowerBound(arr, x); // Find the lower bound
//        using a similar method as in C++
        int L = R - 1;

//        Java + DSA
// Expand the [L, R] window till its size becomes
//        equal to k
        while (k > 0) {
            if (R>=n || (L >= 0 && x - arr[L] <= arr[R] - x)) {
                L--; // Expand from left
            } else {
                R++; // Expand from right
            }
            k--;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = L + 1; i < R; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    // Implementing lower bound function
    private int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        ClosestElements solution = new ClosestElements();
        int [] arr = {-2,-1,1,2,3,4,5};
//        int [] arr = {1};
        int k = 7;
        int x = 3;
        List<Integer> closest = solution.findClosestElements(arr, k, x);
        System.out.println("Closest elements to " + x + " are: " + closest);
    }
}