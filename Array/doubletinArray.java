package Array;

public class doubletinArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, -1, 5};
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    System.out.println("\nTwo number is: "+ arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}
