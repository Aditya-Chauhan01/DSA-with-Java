package Basics;

public class PrintAscii {
    public static void main(String[] args) {
        for (int i = 97; i <= 122 ; i++) {
            char ch = (char)i;
            System.out.println(ch+" - "+i);
        }
    }
}
