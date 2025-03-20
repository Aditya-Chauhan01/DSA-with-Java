package Two2DArrrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(34); a.add(56); a.add(78);

        List<Integer> b = new ArrayList<>();
        b.add(12); b.add(89);

        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(25);

        List <List<Integer>> l = new ArrayList<>();     // arraylist ke ander arraylist
        l.add(a); l.add(b); l.add(c); l.add(d);
//        l.remove(b);

        for (int i = 0; i < l.size(); i++) {
            int x = l.get(i).size();
            for (int j = 0; j < x; j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
//        l.clear();  // clear existing list
        System.out.println(l);
     }


}
