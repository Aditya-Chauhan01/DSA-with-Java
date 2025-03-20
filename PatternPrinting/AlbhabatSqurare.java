package PatternPrinting;

import java.util.Scanner;

public class AlbhabatSqurare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
