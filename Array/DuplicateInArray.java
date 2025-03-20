package Array;

import java.util.ArrayList;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {12, 11, 40, 12, 5, 4, 5, 4, 4};
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    if(ans.contains(arr[i])) break;
                    else ans.add(arr[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
