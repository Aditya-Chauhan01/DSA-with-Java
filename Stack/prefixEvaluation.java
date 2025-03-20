package Stack;

import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        String s = "-8/*+5376";

        Stack<Integer> st = new Stack<>();
        for (int i = s.length()-1; i >= 0; i--) {   // in prefix we evaluate from right to left
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                st.push(ascii - 48);    // push actual integer
            }
            else {
                int val1 = st.pop();
                int val2 = st.pop();
                if(ch == '+') st.push(val1 + val2);
                if(ch == '-') st.push(val1 - val2);
                if(ch == '*') st.push(val1 * val2);
                if(ch == '/') st.push(val1 / val2);
            }
        }
        System.out.println(st.peek());
    }
}
