package Stack;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(25);
        s.push(56);
        s.push(87);
        s.push(69);
        s.push(12);
        System.out.println(s);

        Stack<Integer> st_temp = new Stack<>();
        while (!s.isEmpty()){       // store the elements in temp stack from original and then again store the ele in ans stack from temp stack
            st_temp.push(s.pop());
        }
        System.out.println(st_temp);

        Stack<Integer> st_final = new Stack<>();
        while (!st_temp.isEmpty()){       // store the elements in temp stack from original and then again store the ele in ans stack from temp stack
            int ele = st_temp.pop();
            st_final.push(ele);
        }
        System.out.println(st_final);
    }
}

