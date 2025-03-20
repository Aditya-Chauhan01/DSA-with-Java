package PatternPrinting;

import java.util.Scanner;

public class NumberFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <=n; j++) {
                if (j <= n-i ) System.out.print(" "+ " ");
                else System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
