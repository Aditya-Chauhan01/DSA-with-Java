package String;

import java.util.Scanner;

public class maxOccurenceOfcharacter {      // let all characters are smaller
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }

        int maxfreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxfreq = Math.max(maxfreq, freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if( freq[i] == maxfreq ) {
                char ch = (char)(i + 97);
                System.out.print(ch + " ");
            }
        }
    }
}
