package String;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("");
        System.out.println(a.length()); // 0
        System.out.println(a.capacity());   // by default the capacity of string builder is 16
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s.length()); // used capacity is a length
        System.out.println(s.capacity());   // 19
        StringBuilder str = new StringBuilder(10);  // specific capacity dene par vahi capacity ho jati hai
        System.out.println(str.length());   // 0
        System.out.println(str.capacity()); // 10

        // input a string builder

        Scanner sc = new Scanner(System.in);
//        String in = sc.nextLine();
//        StringBuilder sb = new StringBuilder(in);
//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        System.out.println(sb);
//        sb.setCharAt(0,'t');        // setcharAt method use to change the string
//        System.out.println(sb);

        // append method
        StringBuilder t = new StringBuilder("Addi");
        t.append(45);
        System.out.println(t);
        t.append('z');
        System.out.println(t);
        t.append(25.4);
        System.out.println(t);
        char[] ch= {'a', '3', 'r','t'};
        t.append(ch);
        System.out.println(t);
//        int[] arr= {4,2,5,6,3};
//        t.append(arr);        // int array is not append in string builder (append their address)
//        System.out.println(t);
        t.append(s);    //  also append string builder
        System.out.println(t);
    }
}
