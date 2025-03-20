package Two2DArrrays;

public class bothDiagonal {
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
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j) %2 == 0) System.out.print(arr[i][j]+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
