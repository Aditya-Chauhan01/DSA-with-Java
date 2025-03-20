package Stack;

import java.util.Stack;

public class prefixTopostfix {      // jab bhi prefix ki baat aati hai to right to left chalte hein
    public static void main(String[] args) {
        String str = "-8/*+5376";
        Stack <String> st = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57){
                st.push(ch + "");
            }
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                String t = v1 + v2 + ch;
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}
