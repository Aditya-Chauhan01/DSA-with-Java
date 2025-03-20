package Sorting;

public class InsertionSort {
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,-3,2,-1, -8,-10, 0};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j >=1 ; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        print(arr);
    }
}
