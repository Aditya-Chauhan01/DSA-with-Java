package Recursion;

import java.util.Scanner;

public class aRaisedToThePowerb {       // T.C. : o(m)
//    public static int power(int n, int m){
//        if(m == 0) return 1;
//        return n * power(n,m-1);
//    }

    public static long power(int n, int m){      // T.C.: o(log m)
        if(m == 0) return 1;
        long ans = power(n,m/2);
        if(m%2 == 0) return ans *  ans;
        else return ans * ans * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(power(n,m));
    }
}
