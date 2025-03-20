package Basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int count = 0;
        if(n==0) count = 1;
        while (n!=0){
            n = n / 10;
            ++count;
        }
        System.out.println("Number of digits of given number is : "+count);
    }

}
