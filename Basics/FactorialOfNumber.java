package Basics;

import java.util.Scanner;

public class FactorialOfNumber {
    static int Factorial(int n){
        int fact = 1;
        while (n != 0){
            fact = fact * n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        System.out.println("Factorial of a given number is : " + Factorial(n));
    }
}
