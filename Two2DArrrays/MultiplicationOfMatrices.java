package Two2DArrrays;

public class MultiplicationOfMatrices {
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
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        int[][] b = {{1, 0, 1, 2}, {2, 1, 0, 0}, {0, 3, 1, 1}};
        if (a[0].length != b.length) {
            System.out.println("Multiplication not possible");
        }
        else {      // Multiplication possible
            int[][] ans = new int[a.length][b[0].length];       // store in new matrice

            for (int i = 0; i < ans.length; i++) {      // ans array ke liye row
                for (int j = 0; j < ans[0].length; j++) {      // ans array ke liye coloumn
                    for (int k = 0; k < b.length; k++) {    // a array ke clmn ya b arrya ke row mein traverse krne ke liye for multiplication
                        ans[i][j] += a[i][k] * b[k][j];         // initially 0 is present in arr[i][j] by default
                    }       // when k loops ends then that particular cell of new array(ans) calculated
                }
            }
            print(a);
            print(b);
            print(ans);
        }
    }
}
