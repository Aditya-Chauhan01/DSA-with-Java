package PatternPrinting;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1 ; i++) {        // for printing top row
            System.out.print(i+" ");
        }
        System.out.println();
        n--;

        for (int i = 1; i <= n; i++) {             // for left side triangle
            int a = 1;
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(a++ +" ");
            }


            for (int k = 1; k <= (2*i)-1; k++) {    // for space pyramid
                System.out.print(" " + " ");
                a++;
            }

//            for (int l = 1; l <=n ; l++) {
//                if (i>l) System.out.print(" "+ " ");
//                else System.out.print("*"+" ");
//            }

//            for (int j = n; j >=i; j--) {
//                System.out.print(a++ + " ");
//            }

            for (int j = 1; j <= n+1-i; j++) {        // for right side triangle (same code as per above left wala)
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
