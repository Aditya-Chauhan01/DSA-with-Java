package Recursion;

public class SumofNo {
    public static int sum(int n){
        if(n==1 || n==0) return n;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sum(n));
    }
}
