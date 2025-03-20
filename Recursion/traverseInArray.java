package Recursion;

public class traverseInArray {
    public static void print(int[] arr, int idx){
        if( idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        print(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,6,2,6,62,6,7};
        print(arr, 0);
    }
}
