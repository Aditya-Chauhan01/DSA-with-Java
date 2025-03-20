// update a string in even indexes by 'a' character
package String;

import com.sun.security.jgss.GSSUtil;

public class UpdateEvenIndex {
    public static void main(String[] args) {
        String s = "Aditya chauhan";
        String str = "";

        // through string builder
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < s.length(); i++) {  // very time and space consuming
//            if (i%2 == 0) sb.setCharAt(i,'a');
//            else sb.setCharAt(i,sb.charAt(i));
//        }
//        s = sb.toString();
//        System.out.println(s);


        for (int i = 0; i < s.length(); i++) {  // very time and space consuming
            if (i%2 == 0) str += 'a';
            else str += s.charAt(i);
        }
        s = str;    // now s indicate new string
        System.out.println(s);
    }
}
