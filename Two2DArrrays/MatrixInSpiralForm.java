package Two2DArrrays;

public class MatrixInSpiralForm {
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3, 0}, {4, 5, 6, 1}, {7, 8, 9, 2}, {5, 9, 6, 4}, {3, 8, 1, 7}};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {4, 5, 6}};
        int m = arr.length;
        int n = arr[0].length;

        int minR = 0; int maxR = m-1;
        int minC = 0; int maxC = n-1;
        print(arr);
        // Spiral printing
        while (minR <= maxR && minC <= maxC){
            // left to right
            for (int j = minC; j <= maxC; j++) {
                System.out.print(arr[minR][j] + " ");
            }
            minR++;

            // top to bottom
            if(minR > maxR || minC > maxC ) break;
            for (int j = minR; j <= maxR; j++) {
                System.out.print(arr[j][maxC] + " ");
            }
            maxC--;

            // Right to left
            if(minR > maxR || minC > maxC ) break;
            for (int j = maxC; j >= minC; j--) {
                System.out.print(arr[maxR][j] + " ");
            }
            maxR--;

            // Bottom to top
            if(minR > maxR || minC > maxC ) break;
            for (int j = maxR; j >= minR; j--) {
                System.out.print(arr[j][minC] + " ");
            }
            minC++;
        }

    }
}
