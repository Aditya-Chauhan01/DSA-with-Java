package PatternPrinting;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {        //not completed
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) System.out.print(i);
                else System.out.print(j);
            }
            System.out.println();
        }
    }
}

