package AdvancedSorting;

public class QuickSortAlgorithm {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partiton(int[] arr, int lo, int hi){
        int pivot = arr[lo], pivotIdx = lo;
//        int smallerCount = 0;
//        for (int i = lo+1; i <= hi; i++) {
//            if(arr[i] <= pivot) smallerCount++;
//        }
//        int correctIdx = pivotIdx + smallerCount;

                        // OR (optimised solution)

        int i = lo;
        for (int j = lo+1; j <= hi; j++) {
            if(arr[j] <= pivot){
                i = i+1;
                swap(arr, i,j);
            }
        }
        swap(arr, i, pivotIdx);
        return i;

                // OR

//        int mid = (lo + hi)/2;          // randomized quick sort
//        int pivot = arr[mid], pivotIdx = mid;
//        int smallerCount = 0;
//        for (int i = lo; i <= hi; i++) {
//            if( i == pivotIdx) continue;
//            if(arr[i] <= pivot) smallerCount++;
//        }

//        int correctIdx = lo + smallerCount;
//        swap(arr,pivotIdx, correctIdx);
//
//         partition -> smaller elements ko left side or bigger ko right mein rakhna
//        int i=lo, j = hi;
//        while (i<correctIdx && j>correctIdx){
//            if(arr[i] <= pivot) i++;
//            else if (arr[j] > pivot) j--;
//            else if(arr[i] > pivot && arr[j] <= pivot) swap(arr,i,j);
//        }
//
//        return correctIdx;
    }
    public static void quicksort(int[] arr, int lo, int hi){
        if(lo >= hi) return;        // base case (we have only one array nothing will be in left or right so we remove =)
        int idx = partiton(arr,lo,hi);      // arr[lo] keep it in its correct position & left side <= pivot aur right side > pivot

        quicksort(arr, lo,idx-1);
        quicksort(arr, idx+1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        print(arr);
        int n = arr.length;
        quicksort(arr,0,n-1);
        print(arr);
    }
}
