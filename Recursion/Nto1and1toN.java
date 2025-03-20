package Recursion;

public class Nto1and1toN {
//    public static void counting(int n){        // N to 1
//        if(n==0) return;    // base case
//        System.out.print(n + " ");
//        counting(n-1);
//    }

    public static void counting(int n){      // 1 to N
        if(n==0) return ;  // base case  
        counting(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        counting(n);
    }
}
