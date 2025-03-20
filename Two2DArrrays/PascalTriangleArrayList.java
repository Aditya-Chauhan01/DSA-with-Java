package Two2DArrrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangleArrayList {
    public static List< List<Integer>> generate(int n){     // n = no. of rows
        List< List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) l.add(1);
                else l.add (ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            ans.add(l);     //  store in 2d arraylist
        }
        //          OR replace with if else
//        for (int i = 2 ; i < n; i++) {
//            for (int j = 1; j < i; j++) {
//                ans.get(i).set(j, (ans.get(i-1).get(j) + ans.get(i-1).get(j-1)) );
//            }
//        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        System.out.println(generate(n));
    }
}
