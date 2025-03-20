package Array;

public class SmallestPositiveMissing {
    public static void main(String[] args) {
        int[] arr = {-5,-3,-1, 2, 3,4,6,7, 8};
        int n = arr.length;
        // own method
        boolean flag = false;
        for (int i = 0; i < n-1; i++) {
            if((arr[i] + 1) != arr[i+1] && (arr[i] >= 0)) {
                System.out.println(arr[i] + 1);
                flag = true;
                break;
            }
        }
        if(!flag){
            if (arr[0] > 1) System.out.println(arr[0] - 1);
            else System.out.println(arr[n-1] + 1);
        }
        
        
//        // Method- 2
//        int ans = 1;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == ans) ans++;
//        }
//        System.out.println(ans);
    }
}
