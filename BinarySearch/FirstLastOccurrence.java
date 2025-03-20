package BinarySearch;

public class FirstLastOccurrence {
    public static void firstLastoccurrence(int[]arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        int low, high, firstPosition, lastPosition;
        low = 0; high = n-1;
        firstPosition = -1; lastPosition = -1;

        // for finding firstposition
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                if(mid > 0 && arr[mid] == arr[mid-1]) high = mid-1;
                else {
                    firstPosition = mid;
                    break;
                }
            }
            else if(arr[mid] > target) high = mid-1;
            else if(arr[mid] < target) low = mid+1;
        }

        // for finding lastposition
        low = 0; high = n-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                if(mid+1 < n && arr[mid] == arr[mid+1]) low = mid+1;
                else {
                    lastPosition = mid;
                    break;
                }
            }
            else if(arr[mid] > target) high = mid-1;
            else if(arr[mid] < target) low = mid+1;
        }

        ans[0] = firstPosition; ans[1] = lastPosition;
        for(int ele: ans){
            System.out.print(ele +  " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {10, 15, 15,20 ,20 ,20 ,20,20, 40 ,50};
        int target = 20;
        firstLastoccurrence(arr, target);
    }
}
