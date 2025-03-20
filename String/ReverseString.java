package String;

public class ReverseString {
    public static void reverseString( StringBuilder sb, int i, int j){
        while (i<j){
            char ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        String s = "hello my name is Aditya";
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int i = 0, j = 0;
        while (j<n){
            if(sb.charAt(j) != ' ') j++;
            else {
                reverseString(sb,i,j-1);
                i = j + 1;
                j = i;
            }
        }
        reverseString(sb,i,j-1);
        System.out.println(sb);
    }

}
