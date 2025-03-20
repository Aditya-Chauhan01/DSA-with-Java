package Recursion;

import java.util.Scanner;

public class BinaryString {     // binary string of length n without consecutive 1's
    public static void printString(String ans, int n){
        int m = ans.length();
        if(m == n){
            System.out.println(ans);
            return;
        }
        if(m == 0 || ans.charAt(m-1) == '0'){
            printString(ans+0, n);
            printString(ans+1, n);
        }
        else printString(ans+0, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        printString("", n);
    }
}
