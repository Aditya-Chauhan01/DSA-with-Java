package BinarySearch;

public class LowerBoundUpperBound {
    public static void main(String[] args) {
//        int[] arr = {10,15,20,20,30,46,46,70};
//        int[] arr = {1,2,3,3,4};
        int [] arr = {-2,-1,1,2,3,4,5};
        int n = arr.length;
        int lb = n;
        int target = 3;
        int low = 0, high = n-1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){     // for upper bound ( arr[mid] > target) same code as it is
//                lb = Math.min(lb,mid);    // or lb = mid // update minimum
                high = mid-1;       // high = mid;
            }
            else low = mid + 1;
        }
//        System.out.println(lb);
        System.out.println(low); // idx
    }
}
