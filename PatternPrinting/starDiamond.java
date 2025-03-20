package PatternPrinting;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print(" "+" ");
            }

            for (int k = 1; k <= nst; k++) {
                System.out.print("*"+ " ");
            }
            if (i<n/2+1){
                nsp--;
                nst+=2;
            }
            else {
                nsp++;
                nst-=2;
            }
            System.out.println();
        }
    }
}

