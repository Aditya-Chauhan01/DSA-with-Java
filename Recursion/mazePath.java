package Recursion;

import java.util.Scanner;

public class mazePath {
    public static int maze(int currentRow, int currentcol, int endRow, int endCol){
        if(currentRow == endRow || currentcol == endCol) return 1;

        int rightWays = maze(currentRow, currentcol+1, endRow, endCol);
        int downWays = maze(currentRow+1, currentcol, endRow, endCol);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of coloumns: ");
        int m = sc.nextInt();
        System.out.println(maze(1,1,n,m));
    }
}
