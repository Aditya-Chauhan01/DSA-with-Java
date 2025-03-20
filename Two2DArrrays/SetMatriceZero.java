package Two2DArrrays;

public class SetMatriceZero {
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
        int[][] arr = {{0, 5, 0}, {2, 7, 8}, {3, 4, 1}};
        int m = arr.length;
        int n = arr[0].length;
//        int [][] helper = new int[m][n];
//        for (int i = 0; i < m; i++) {   // deep copy
//            for (int j = 0; j < n; j++) {
//                helper[i][j] = arr[i][j];
//            }
//        }
//        for (int i = 0; i < m; i++) {   // deep copy
//            for (int j = 0; j < n; j++) {
//                if (helper[i][j] == 0){
//                    for (int k = 0; k < n; k++) {
//                        arr[i][k] = 0;
//                    }
//                    for (int k = 0; k < m; k++) {
//                        arr[k][j] = 0;
//                    }
//                }
//            }
//        }

            // method- 2
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {       // for only rows
            if (row[i] == true){
                for (int j = 0; j < m; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {      // for only columns
            if (col[j]){        // col[i] == true
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        print(arr);
    }
}
