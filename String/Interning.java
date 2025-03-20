package String;

public class Interning {
    public static void main(String[] args) {
        // String is immutable
        String s = "Aditya";
//        s.charAt(0) = "S";    // we can't change individual character of string
        s = "Shimaru"; // Replace nhi hua hai. it becomes another string in memory
        System.out.println(s);

        String str1 = "Hitesh";
        String str2 = "Hitesh";     // that means str2 now refer existing string. check first existing string present or not

        String a = new String("Hitesh");    // that means A second memory created in memory
        System.out.println(a);

    }
}
