package Stack;

import java.util.Stack;

public class prefixToinfix {
    public static void main(String[] args) {
        String str = "-8/*+5376";
        java.util.Stack<String> st = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57){
                st.push(ch + "");
            }
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                String t = "(" + v1 + ch + v2 + ")";
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}
//note: same code for postfix to infix and postfix to prefix but go will from left to right and first pop is v2 and second pop will v1.