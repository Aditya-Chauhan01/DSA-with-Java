package Stack;

import java.util.Stack;

public class recursivelyReverseStack {
    public static void insert(int item, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int top = st.pop();
        insert(item,st);
        st.push(top);
    }
    public static void recursive(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        recursive(st);

        insert(top,st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        recursive(st);
        System.out.println();
        System.out.println(st);
    }
}
