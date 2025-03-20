package Stack;
import java.util.Stack;
public class infixExpression {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";

        Stack <Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57) // character is a number
                val.push(ascii - 48);       // now charcter is intger
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if (ch == ')') {
                while (op.peek() != '('){
                    int val2 = val.pop();
                    int val1 = val.pop();

                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    if(op.peek() == '*') val.push(val1 * val2);
                    if(op.peek() == '/') val.push(val1 / val2);
                    op.pop();       // remove the operator
                }
                op.pop();   // remove the opening bracket
            }
            else{   // operator stack is not empty then check precedency
                if(ch == '+' || ch == '-'){
                    // we will always have to do the operation
                    int val2 = val.pop();
                    int val1 = val.pop();

                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    if(op.peek() == '*') val.push(val1 * val2);
                    if(op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if(op.peek() == '*' || op.peek() == '/'){
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek() == '*') val.push(val1 * val2);
                        if(op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);       // multiply or divide nhi hai
                }
            }
        }
    while(val.size() > 1){
        int val2 = val.pop();
        int val1 = val.pop();
        if(op.peek() == '+') val.push(val1 + val2);
        if(op.peek() == '-') val.push(val1 - val2);
        if(op.peek() == '*') val.push(val1 * val2);
        if(op.peek() == '/') val.push(val1 / val2);
        op.pop();
    }
        System.out.println(val.peek());
    }
}
