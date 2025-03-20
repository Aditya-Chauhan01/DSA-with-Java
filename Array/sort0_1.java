package Array;

public class sort0_1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,1,0};
//        int noz = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0) noz++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(i<noz) arr[i] = 0;
//            else arr[i] = 1;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }

        //Method- 2 (two pointer approach)
        int low = 0, high = arr.length-1;
        while (low<high){
            if(arr[low] == 0) low++;
            else if (arr[high] == 1) high--;
            else if (arr[low] == 1 && arr[high] == 0) {
                arr[low] = 0; arr[high] = 1;
                low++; high--;
            }

        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
