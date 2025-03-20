package Stack;

import java.util.Stack;

public class infixToprefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(str);

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57) { // character is a number
                String s = "" + ch;
                val.push(s);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if (ch == ')') {
                while (op.peek() != '('){
                    // do the operation
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();

                    String t = o + val1 + val2;
                    val.push(t);
                }
                op.pop();   // remove the opening bracket
            }
            else{   // operator stack is not empty then check precedency
                if(ch == '+' || ch == '-'){
                    // we will always have to do the operation
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();

                    String t = o + val1 + val2;
                    val.push(t);
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if(op.peek() == '*' || op.peek() == '/'){
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char o = op.pop();

                        String t = o + val1 + val2;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size() > 1){
            String val2 = val.pop();
            String val1 = val.pop();
            char o = op.pop();

            String t = o + val1 + val2;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
