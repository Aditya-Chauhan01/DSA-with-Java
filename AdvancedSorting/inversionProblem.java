package AdvancedSorting;

public class inversionProblem {     // Leetcode: 493(reverse pair)
    static int count = 0;
//    public static void inversion(int[] a, int[] b){
//        int i=0, j=0;
//        while(i<a.length && j<b.length){
//            if( a[i] > b[j] ){
//                count += a.length - i;
//                j++;
//            }
//            else i++;
//        }
//    }
    public static void merge(int[] c, int[] a, int[] b){
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else {  // a[i] > b[j]              // can do it without making inversion
                c[k++] = b[j++];
                count += a.length - i;
            }
        }
        while (i<a.length) c[k++] = a[i++];
        while (j<b.length) c[k++] = b[j++];
    }
    public static void mergesort(int[] nums){
        int n = nums.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i=0; i<n/2; i++) a[i] = nums[i];
        for(int i=0; i<n-n/2; i++) b[i] = nums[i+n/2];

        mergesort(a);
        mergesort(b);
//        inversion(a,b);
        merge(nums,a,b);
        a = null; b = null;
    }

    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
//        count = 0;
        mergesort(arr);
        System.out.println(count);
    }
}
