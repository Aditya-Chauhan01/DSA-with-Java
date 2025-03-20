package Array;

import java.util.Arrays;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        int[] arr = {40, 25, 60, 78, 80};
//        Arrays.sort(arr);
//        int[] brr = arr;       // Shallow copy(also reflected in original array)

//        int[] brr = Arrays.copyOf(arr, arr.length);   // Deep copy
//        for (int ele : brr) {
//            System.out.print(ele + " ");
//        }
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {      //Deep copy(not change in original array)
            brr[i] = arr[i];
        }
        System.out.println();
        brr[0] = 100;
        for (int ele : brr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(arr[0]);
    }

}
