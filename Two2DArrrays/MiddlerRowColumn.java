package Two2DArrrays;

public class MiddlerRowColumn {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 0,3}, {4, 5, 6, 1,5}, {7, 8, 9, 2,6}, {5, 9, 6, 4,2}, {3, 8, 1, 7,4}};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == (n/2) || j == (n/2)) System.out.print(arr[i][j]+ " ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
