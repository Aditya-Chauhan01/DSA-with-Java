package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class arraySubset90 {   // leetcode: 90 (remove duplicates)
    static List<List<Integer>> ans = new ArrayList<>();
    public static void subset(int[] nums, int idx, List<Integer> sub){
//        List<Integer> a = new ArrayList<>(sub);
//        Collections.sort(a);    //Sorting ensures that duplicate numbers are grouped, and similar subsets appear in the same order, thus allowing the duplicate check to work correctly.
        if(idx == nums.length){
            List<Integer> a = new ArrayList<>(sub);
            Collections.sort(a);
            if(!ans.contains(a)){
                ans.add(a);
            }
            return;
        }

        sub.add(nums[idx]);
        subset(nums, idx+1, sub);
        sub.remove(sub.size()-1);       // backtracking
        subset(nums, idx+1, sub);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();    // because when we called main method multiple times then static variable accumulating from all previous run result. so need to clear.
        subset(nums, 0, new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        ans.clear();
        int[] nums = {4,4,4,1,4};
//        int[] nums = {0};   // check for zero, it relates for ans.clear()
        subset(nums, 0, new ArrayList<>());
        System.out.println(ans);
    }
}
