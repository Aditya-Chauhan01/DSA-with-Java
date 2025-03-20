package Basics;

import java.util.Scanner;

public class SumOfEvenDigits {
    static int SumOfevenDigits(int n){
        int sum = 0;
        while (n!=0){
            int rem = n % 10;
            if(rem % 2 == 0){
                sum += rem;
            }
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println("sum of digits are: "+ SumOfevenDigits(n));
    }
}
