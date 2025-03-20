package PatternPrinting;

import java.util.Scanner;

public class reversePriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n+1-i; j++) {    // Reverse Number Triangle
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {          // Alphabat reverse
                System.out.print((char) (i+64) +" ");
            }
            System.out.println();
        }
    }
}

