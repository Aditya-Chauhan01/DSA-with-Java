package Array;

import java.util.ArrayList;

//import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        System.out.println(arr.size());
        arr.add(100);   // add element end of the array

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        //set method is used for modifying
        arr.set(2,90);      // modify 2nd index with 90

        arr.remove(3);  // remove a particular element
        System.out.println(arr);    // print the arraylist
    }
}
