package String;

public class StringCompression {  // o/p "c2a3bd3a2f2"      Leetcode: 443
    public static void main(String[] args) {
//        String s = "ccaaabdddaaff";
        String s = "aabbccc";
        char[] ch = s.toCharArray();    //as per leetcode
        int n = ch.length;
        String ans = "";
        int len = 0;
        int i = 0, j = 0;
        while (j<n){
            if (ch[i] == ch[j]) j++;
            else {
                ans += ch[i];
                len = j - i;    // length of occurence
                if(len > 1) ans += len;
                i = j;
            }
        }
        ans += ch[i];
        len = j - i;
        if(len > 1) ans += len;
        // here write the for loop for ans. which replaced with input array or string

        System.out.print(ans);
    }
}
