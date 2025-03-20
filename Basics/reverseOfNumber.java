package Basics;

import java.util.Scanner;

public class reverseOfNumber {
    static int reverse(int n){
        int rem = 0;
        while (n != 0) {
             rem = (rem * 10) + (n % 10);
            n /= 10;
        }
    return rem;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println("Reverse of a given Number is : " + reverse(n));
    }
}
