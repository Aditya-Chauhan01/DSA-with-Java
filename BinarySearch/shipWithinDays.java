package BinarySearch;

public class shipWithinDays {       // Leetcode: 1011
    public static boolean possible(int[] arr, int capacity, int n, int days){
        int load  = 0 , d =1;
        for(int i = 0; i<n; i++){
            if(load + arr[i] <= capacity) load += arr[i];
            else{
                load = arr[i];
                d++;
            }
        }
        if(d <= days) return true;
        return false;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i= 0; i<n; i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];    // min capacity of ship of shipping packages in 1 day
        }

        int low = max, high = sum;
        while(low<=high){           // Binary search on capacity
            int mid = low + (high-low)/2;
            if(possible(weights,mid,n, days)){      // call the method
                // minCapacity = mid     // updating of mid(capacity)
                high = mid-1;
            }
            else low = mid + 1;
        }
        return low;  // return minCapacity
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,5));
    }
}
