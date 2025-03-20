package Array;

public class DutchFlag {        // for 0,1,2 sorting
    public static void main(String[] args) {
        int[] arr = {0,2,1,0,1,2,0,2,1,1,2};
//        int noz = 0; int noO = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0) noz++;
//            else if (arr[i] == 1) noO++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(i<noz) arr[i] = 0;
//            else if (i<(noz+noO)) arr[i] = 1;
//            else arr[i] = 2;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }

        //      Method -2 (Dutch flag algorithm)
        int n = arr.length;
        int low=0; int mid = 0; int high = n-1;
        while (mid <= high) {
            if (arr[mid] == 0) {        // we use mid for checker in whole array 
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            } else mid++;       // i.e. 1's coming in the position
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
    public static void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
