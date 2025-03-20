package Recursion;

public class PreInPost {
    public static void pip(int n){
        if(n == 0) return;
        System.out.println(n);  // pre (sarri calls se phle ka work)
        pip(n-1);
        System.out.println(n);  // In (calls ke beech ka work)
        pip(n-1);
        System.out.println(n);  // post (calls ke baad ka work)
    }
    public static void main(String[] args) {
        int n = 3;
        pip(n);
    }
}
