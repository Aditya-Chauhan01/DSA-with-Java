package Sorting;

public class TransformArray {
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print((ele*-1) + " ");   // make them +ve by multiplying -1
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};
        // o/p -     3  0  5  2   6  4  1   (ascending order)

        print(arr);
        int n = arr.length;
        int idx = -1;
        int x = 0;
        for (int i = 0; i < n; i++) {       // no. of passes
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if(arr[j] < min && arr[j] > 0){     // arr[j] > 0 (+ve)
                    min = arr[j];
                    idx = j;
                }
            }
            arr[idx] = x--;
        }
        print(arr);
    }
}
