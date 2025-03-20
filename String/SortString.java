package String;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "anagram";

        char[] ch =  s.toCharArray();
        StringBuilder sb = new StringBuilder(s);   // sort the string builder by built in method
         ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
    }
}
