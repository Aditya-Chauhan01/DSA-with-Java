package String;

import java.util.Scanner;

import static java.lang.System.out;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();   // this method read only one word
//        String s = sc.nextLine();   // read complete sentence
        String s = "Aditya chauhan";
//        System.out.println(s);
        int n = s.length();
        char ch = s.charAt(4);  // y
        int idx = s.indexOf("a");  //6     // which comes first their value return
        int ix = s.lastIndexOf("a");    // 12
        int ix2 = s.lastIndexOf("z");     // if char is not present in string it returns -1

        String str1 = "abc";
        String str2 = "aba";
        String str3 = "abc";
        String str4 = "abctett";
        String str5 = "abc";
//        System.out.println(str1.compareTo(str2));     // ascii(a) - ascii(d) 1-4 = -3
//        out.println(str1.compareTo(str3));      // same string ans is 0
//        out.println(str3.compareTo(str4));  // str3 - str4 = -4 same string ke baad jitni length hoti hai vhi return hota hai
//        out.println(str4.compareTo(str5));  // 4 jisko compare krte usse substract hota hai

        out.println(s.contains("an"));
        out.println(s.startsWith("Adi"));
        out.println(s.endsWith("ya"));
//        String cnct = str1.concat(str2);  // through it cannot add number
        String cnct =str1 + 10; // append any number as well as character also (+ operator makes entire statement in string)
        out.println(cnct);

        out.println(Integer.toString(2));
    }
}
