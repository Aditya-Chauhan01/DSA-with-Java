package Basics;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

//        for (int i = 1; i <= 10; i++){
//            int m = i * 19;
//            System.out.println(m);
//        }

        for (int i = n; i <= n * 10; i += n){
            System.out.println(i);
        }
    }
}
