package Recursion;

public class CountAndSay {
    public static String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);

        // String ans = "";        // this is time consuming
        StringBuilder sb = new StringBuilder();
        int count = 1;  // note that first 1 initilized
        int m = s.length();
        // int len = 0;
        for(int i=0; i<m; i++){     // in while loop memory limit exceeded
            if(i + 1 < m && s.charAt(i) == s.charAt(i+1)) {
                count++;
            }
            else{
                //    len = j-i;
                //    ans += len;
                //    ans += s.charAt(i);
                //    i = j;

                sb.append(count).append(s.charAt(i));
                count = 1;
            }
        }
        // len = j-i;
        // ans += len;
        // ans += s.charAt(i);
        return sb.toString();
    }
    public static void main(String[] args) {
    int n = 5;
        System.out.println(countAndSay(n));
    }
}
