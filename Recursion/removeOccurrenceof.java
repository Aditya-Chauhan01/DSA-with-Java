package Recursion;

public class removeOccurrenceof {  // remove occurrence of 'a' from string
    public static void remove(String s, int idx, String ans){
        if(idx == s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(idx) != 'a') ans += s.charAt(idx);
        remove(s, idx+1, ans);
    }

//    public static void print(int n,String s){   // not satisfied because we can't store the new string
//        if (n == s.length()) return;
//        if (s.charAt(n) != 'a') System.out.print(s.charAt(n));
//        print(n+1,s);
//    }

    public static void main(String[] args) {
        String s = "aaditya chauhan";
        remove(s, 0, "");

//        String s = "aaditya chauhan";
//        print(0,s);
    }
}
