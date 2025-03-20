package AdvancedSorting;

public class mergeSort {
    public static void print(int[] arr){
        for(int ele: arr) System.out.print(ele + " ");
        System.out.println();
    }
    public static void merge(int[] arr, int[] a, int[] b){
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while (i<a.length) arr[k++] = a[i++];
        while (j<b.length) arr[k++] = b[j++];
    }
    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n == 1) return;

        int[] a = new int[n/2];     // divide the array into two parts
        int[] b = new int[n-n/2];

        for(int i=0; i<n/2; i++) a[i] = arr[i];     // copy and paste
        for(int i=0; i<(n-n/2); i++) b[i] = arr[i+n/2];

        mergesort(a);
        mergesort(b);
        merge(arr, a,b);
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {65,23,85,98,27,48,12,63};
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
