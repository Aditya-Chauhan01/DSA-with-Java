package Recursion;

import java.util.Scanner;

public class nthFibonnaci {
    public static int fibo(int n){
        if (n == 0 || n==1) return n;

        int a = 0;
        int b = 1;
        int sum = 1;
        for(int i = 0; i<=n-2; i++) {       // nth fibonacci number
//            System.out.print(a + " ");    // for first n fibo numbers: i=0; i<n;
            sum = a + b;
            a = b;
            b = sum;
        }
//        int sum = fibo(n-1) + fibo(n-2);    // recursive
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
        System.out.println(fibo(n));
    }
}
