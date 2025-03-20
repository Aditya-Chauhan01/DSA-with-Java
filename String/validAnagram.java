package String;

import java.util.Arrays;

public class validAnagram {     // leetcode: 242
    public static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) return false;
//
//        int[] ch1 = new int[26];
//        int[] ch2 = new int[26];
//        for(int i = 0; i<s.length(); i++){
//            ch1[s.charAt(i) - 'a']++;
//        }
//        for(int i = 0; i<t.length(); i++){
//            ch2[t.charAt(i) - 'a']++;
//        }
//
//        for(int i = 0; i< 26; i++){
//            if (ch1[i] != ch2[i] ) return false;
//        }
//        return true;

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return (Arrays.equals(ch1,ch2));
    }
    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
