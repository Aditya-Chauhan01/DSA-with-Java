package Stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(25);
        s.push(56);
        s.push(87);
        s.push(69);
        s.push(12);
        System.out.println(s);  // print the stack
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());    // it gives boolean

        // reverse
        Stack<Integer> st_reverse = new Stack<>();
        while (!s.isEmpty()){
            int ele = s.pop();
            st_reverse.push(ele);
        }
        System.out.println(st_reverse);
    }
}
