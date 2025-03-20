package String;

import java.util.Scanner;

public class ToggalOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(97 <= ascii && ascii <= 122){
                ascii -= 32;
            }
            else if(65 <= ascii && ascii <= 97){
                ascii += 32;
            }
            ch = (char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
