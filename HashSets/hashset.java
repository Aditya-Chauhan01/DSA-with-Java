package HashSets;

import java.util.HashSet;
import java.util.Objects;

public class hashset {
    public static void main(String[] args) {
        /* Note: HashSets is a interface in which insertion, deletion, and searching(contains) done in O(1) time.*/
        HashSet<Integer> set = new HashSet<>();
        // insertion
        set.add(10);
        set.add(20);
        set.add(200);
        set.add(-7);
        System.out.println(set);    // elements are store in random order each time

        // searching = give ans. in ture/false
        System.out.println(set.contains(90));

        // remove: if we remove such element which is not present in set then it will not give any error
        System.out.println(set.remove(10));     //remove method return true and false if it present or not as well as delete that ele.
        System.out.println(set);
        set.remove(100);    // which is not present then...
        System.out.println(set);

        // size
        System.out.println(set.size());
        set.add(200);
        set.add(-7);        // note: duplicate elements doesn't add in hashsets
        set.add(50);
//        set.clear();    // if delete all elements
        System.out.println(set);

        // convert sets into Array
        Object[] arr = set.toArray();   // as hashset integer type class se wrape hai chunki vo ek interface hai isiliye object datatype ka array hai
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        for(Object a : arr){
//            System.out.println(a);
//        }

        // print the elements of hashset we use 'for each loop' because hashsets doesn't have indexing
        for (int ele : set){
            System.out.print(ele + " ");
        }
        
    }
}
