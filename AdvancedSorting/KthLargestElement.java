package AdvancedSorting;

import java.util.Arrays;

public class KthLargestElement {        // Leetcode: 215
    static int ans;
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partiton(int[] arr, int lo, int hi){
//        int pivot = arr[lo], pivotIdx = lo;
//        int smallerCount = 0;
//        for (int i = lo+1; i <= hi; i++) {
//            if(arr[i] <= pivot) smallerCount++;
//        }
//        int correctIdx = pivotIdx + smallerCount;
        // OR
        int mid = (lo + hi)/2;          // randomized quick sort
        int pivot = arr[mid], pivotIdx = mid;
        int smallerCount = 0;
        for (int i = lo; i <= hi; i++) {
            if( i == pivotIdx) continue;
            if(arr[i] <= pivot) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        swap(arr,pivotIdx, correctIdx);

        // partition -> smaller elements ko left side or bigger ko right mein rakhna
        int i=lo, j = hi;
        while (i<correctIdx && j>correctIdx){
            if(arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot) swap(arr,i,j);
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr, int lo, int hi, int k){
//        if(lo > hi) return;        // base case (we have only one array nothing will be in left or right so we remove =)
        int idx = partiton(arr,lo,hi);      // arr[lo] keep it in its correct position & left side <= pivot aur right side > pivot
        if(idx == k-1){
            ans = arr[idx];
            return;
        }

        if(k-1 < idx) quicksort(arr, lo,idx-1,k);
        else quicksort(arr, idx+1, hi,k);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};        // quickSelect algorithm
        int n = arr.length;
        int k = 3;      // that means n-k+1 wala smallest no. hoga
        ans = 0;
        quicksort(arr, 0, arr.length-1, n-k+1);     // without sorting
        System.out.println(ans);

        // one way is that method
//        Arrays.sort(arr);     // Time complexity: O(nlogn)
//        System.out.println(arr[arr.length-k]);  // 0 based indexing (n-k)
    }
}
