package Two2DArrrays;

public class TransformInTranspose {
    public static void print(int[][] arr,int m){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{2,3,34},{2,6,7},{4,6,22}};      // Transpose in same matrix, the matrix should be square(3*3)
        int m = arr.length;
        print(arr, m);
        // Transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <=i; j++) {   // in swap we go half
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr, m);
    }
}
