package String;

public class StringOfmaxValue {
    public static String max(String a, String b){       // if a = 078 , b = 0078
        // if leading zeros then....
        String s = a, t = b;
        if(s.charAt(0) == '0') s = nonZeros(a);
        if (t.charAt(0) == '0') t = nonZeros(b);

        if(s.length() > t.length()) return a;
        if(s.length() < t.length()) return b;
        for (int i = 0; i < a.length(); i++) {      // if length is same of both string
            if (s.charAt(i) != t.charAt(i)){
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
                        // or
//            if(a.charAt(i)>b.charAt(i)) return a;
//            if (b.charAt(i) > a.charAt(i)) return b;
        }
        if(a.length() >= b.length()) return a;
        else return b;
    }
    public static String nonZeros(String str){      // for remove leading zeros
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') return str.substring(i);
        }
        return str;
    }
    public static void main(String[] args) {  // ans in string form
        String[] arr = {"0078", "6463", "454355", "346463343535"};
        String maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxval = max(maxval, arr[i]);
        }
        System.out.println(maxval);
    }
}
