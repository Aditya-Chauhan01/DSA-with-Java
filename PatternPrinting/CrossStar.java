package PatternPrinting;

import java.util.Scanner;

public class CrossStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i+j == n+1 || i == j)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
