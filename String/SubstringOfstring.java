package String;

public class SubstringOfstring {
    public static void main(String[] args) {
        String str = "abcd";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                String substr = str.substring(i,j);
                System.out.print(substr +" ");
            }
            System.out.println();
        }
    }
}
