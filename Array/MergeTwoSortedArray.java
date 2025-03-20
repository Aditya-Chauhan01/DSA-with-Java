package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {11, 50, 62, 71, 79,86, 93};
        int[] arr2 = {20, 34, 47, 65, 89};

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while ((i<arr1.length) && (j<arr2.length)){
            if(arr1[i] < arr2[j]) arr3[k++] = arr1[i++];
            else arr3[k++] = arr2[j++];
        }
        while (i<arr1.length){
            arr3[k++] = arr1[i++];
        }
        while (j<arr2.length){
            arr3[k++] = arr2[j++];
        }

        for(int ele : arr3){
            System.out.print(ele + " ");
        }
    }
}
