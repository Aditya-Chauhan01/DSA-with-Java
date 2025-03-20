package Basics;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        int y = scr.nextInt();
        int z = scr.nextInt();

        if(x >= y && x >= z )
            System.out.println(x + " is greatest");
        else if (y >= x && y >= z) {
            System.out.println(y + " is greatest");
        }
        else System.out.println(z + " is greatest");

    }
}
