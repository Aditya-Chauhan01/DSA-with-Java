package Recursion;

import java.util.ArrayList;     // incomplete+

public class increasingSequence { // Print all increasing sequences of length k from first n natural numbers
    static ArrayList<String> str = new ArrayList<>();
    public static void helper(String n, int i, int k, String s){
        String res = "";
        if(i == k){
            str.add(s);
            return;
        }
//        if(i == s.length()){
//            return;
//        }

        // pick element

        s += n.charAt(i);
        helper(n, i+1, k, s);
//        if( s.length() == k){
//
//        }
        // while backtracking, we need to remove last added element
        n.charAt(n.length() - 1);
        // no pick
        helper(n, i+1, k, s);       // since we have not added any element, so no need to remove for backtracking
    }
    public static void main(String[] args) {
        String n = "123";
        int k = 2;
        str = new ArrayList<>();
        helper(n, 0, k, "");
        System.out.println(str);
    }
}
