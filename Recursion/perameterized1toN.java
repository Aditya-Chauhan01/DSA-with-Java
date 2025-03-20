package Recursion;

public class perameterized1toN {        // print the number in a range through perametrized with recursion
    public static void print(int n, int m){
        if(n > m) return ;
        System.out.print(n + " ");
        print(n+1, m);
    }
    public static void main(String[] args) {
        int n = 1;
        int m = 6;
        print(n, m);
    }
}
