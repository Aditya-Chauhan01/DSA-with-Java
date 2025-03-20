package Array;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,60,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];

//        for (int i = 0; i < arr.length; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i+1; j < arr.length; j++) {
//                max = Math.max(max, arr[j]);
//            }
//            if(i!=arr.length-1) ans[i] = max;
//            else ans[i] = -1;
//        }

        //      Method-2 (Optimised)
        ans[n-1] = -1;
        int NxtG = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            ans[i] = NxtG;
            NxtG = Math.max(NxtG,arr[i]);     // NxtG ko phle he update kar rhe hein
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
