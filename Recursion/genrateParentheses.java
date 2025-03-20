package Recursion;

import java.util.ArrayList;
import java.util.List;

public class genrateParentheses {
    public static void paren(int openbkts, int closebkts,String s, int n , List<String> str){
        if(s.length() == 2*n){
            str.add(s);
            return;
        }

        if(openbkts < n) paren(openbkts+1, closebkts, s+'(', n, str);
        if(closebkts < openbkts) paren(openbkts, closebkts+1, s+')', n, str);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        paren(0, 0,"", n, new ArrayList<>());
        return str;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
