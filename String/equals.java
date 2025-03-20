package String;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
//        System.out.println(s[0]); // this is my mistake
        String t = "abcxyz";
        String a = new String("abcxyz");    // this is new string that create in other location of a memory
        String b = "abc";
        b += "xyz";
        System.out.println(s==t);  // true ( because both variable refer same string)
        System.out.println(s==a);   // false (their addresses checked)
        System.out.println(s==b);   // false (when new string are create of same name then their addresses are compared)
            // avoid from these we use equals
        System.out.println(s.equals(a));    // true
        System.out.println(s.equals(b));    // true
    }
}
