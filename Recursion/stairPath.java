package Recursion;

public class stairPath {    // 1 or 2 jump are allowed
    public static int stair(int n){
        if(n <= 2) return n;    // bcz 2 stair ke ko paar krne ke 2 he ways honge or 1 stair ke liye 1 he ways hoga
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        int NoOfStairs = 4;
        System.out.println(stair(NoOfStairs));
    }
}
