package Array;

import java.util.Scanner;

public class LinearSearch {
    static int LinSearch(int[] arr, int x){
        int index = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a target number: ");
        int x = sc.nextInt();

        System.out.println("index is: " + LinSearch(arr,x));
    }
}
