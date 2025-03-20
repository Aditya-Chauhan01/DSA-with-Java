package Array;

import java.util.Scanner;

public class SecondLargest {
    static int secondLrgst(int[] arr){
        int max = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
//        for (int i = 0; i <arr.length ; i++) {
////            if (arr[i] > max) max = arr[i];
//            max = Math.max(max,arr[i]);
//        }
//        for (int j = 0; j < arr.length; j++) {
////            if((sl < arr[j]) && arr[j] != max) sl = arr[j];
//            if(arr[j] != max)
//                sl = Math.max(sl,arr[j]);
//        }

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max) {
                sl = max;
                max = arr[i];
            } else if ((arr[i] > sl) && (arr[i] != max)) {
                sl = arr[i];
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second largest element in array is: " + secondLrgst(arr));
    }
}
