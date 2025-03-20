package Two2DArrrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,56,34},{2,6,7,21}};
        int m = arr.length;
        int n = arr[0].length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                max = Math.max(max,arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
//        System.out.println(max);
    }
}
