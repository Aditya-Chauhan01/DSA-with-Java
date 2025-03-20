package Recursion;

import java.util.Scanner;

public class HCForGCD {  // Leetcode: 1979
    public static int hcf(int a, int b){
        if( b%a == 0) return a;
        return hcf(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = sc.nextInt();
        System.out.print("Enter second no: ");
        int b = sc.nextInt();

        System.out.println(hcf(a,b));
    }
}
