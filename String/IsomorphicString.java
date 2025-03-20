package String;

public class IsomorphicString {   // incomplete answer
    public static boolean isIsomorphic(String s, String t) {
        char [] ch = new char[128];         // by default '\0'(null character)

        for(int i = 0; i<s.length(); i++){      // check only 'one to many' conditon
            int idx = (int)(s.charAt(i));       // this code is in respective of s
            if(ch[idx] == '\0') ch[idx] = t.charAt(i);
            else {
                if(ch[idx] != t.charAt(i)) return false;
            }
        }
        for(int i =0; i<128; i++){      // reset char array
            ch[i] = '\0';
        }
        for(int i = 0; i<t.length(); i++){      // check 'many to one' conditon
            int idx = (int)(t.charAt(i));       // this code is in respective of t
            if(ch[idx] == '\0') ch[idx] = s.charAt(i);
            else {
                if(ch[idx] != s.charAt(i)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race";
        String t = "mood";

        System.out.println(isIsomorphic(s,t));
    }
}
