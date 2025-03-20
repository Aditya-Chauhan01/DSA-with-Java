package Two2DArrrays;

public class pascalTriangle2DArray {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[5][5];
        for (int i = 0; i < n; i++) {
            for (int j = n-1-i; j > 0 ; j--) {
                System.out.print(" ");
            }
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j) arr[i][j] = 1;
                    else arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                    System.out.print(arr[i][j] + " ");      // by direct printing we need not to create a loop for printing
                }
                System.out.println();
        }


    }
}
