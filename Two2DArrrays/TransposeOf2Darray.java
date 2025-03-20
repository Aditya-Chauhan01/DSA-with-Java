package Two2DArrrays;

public class TransposeOf2Darray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
//        int m = arr.length;        // length of rows (3)
//        int n = arr[0].length;     // length of coloumn (4)

        int[][] brr = {{2,3,56,34},{2,6,7,21}};
        int m = brr.length;
        int n = brr[0].length;
        int[][] transpose = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                transpose[j][i] = brr[i][j];    // store in another matrix
//                System.out.print(brr[i][j] + " ");
            }
//            System.out.println();
        }
        for (int i = 0; i < transpose.length; i++) {    // reverse
            int a = 0, b = transpose[0].length - 1;
            while (a<b){
                int temp = transpose[i][a];
                transpose[i][a] = transpose[i][b];
                transpose[i][b] = temp;
                a++; b--;
            }
        }

        for(int[] ele : transpose){   // for Each loop
            for(int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
