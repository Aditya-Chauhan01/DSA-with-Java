package BinarySearch;

public class squareRoot {       // Leetcode: 69
    public static int mySqrt(int x) {
        if(x<=1) return x;
        int low = 0, high = x;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid == x/mid) return mid;
            else if(mid > x/mid) high = mid-1;
            else low = mid+1;
        }
        return high;
    }
    public static void main(String[] args) {
        int x = 144;
        System.out.println(mySqrt(x));
    }
}
