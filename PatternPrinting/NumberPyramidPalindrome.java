package PatternPrinting;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = 0;
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int k = 1; k <= (i*2)-1 ; k++) {
                if (i < k)
                    a--;
                else a++;
                System.out.print(a +" ");
            }
            System.out.println();
        }
    }
}
