package Basics;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i = 0; i < n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
