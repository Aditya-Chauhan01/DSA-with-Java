package Two2DArrrays;

public class MatrixInwaveform {
    public static void print(int[][] arr,int m, int n) {
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            int[][] arr = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12}};    //(3*4 matrix)
            int m = arr.length;
            int n = arr[0].length;
            print(arr, m,n);
        }
}

