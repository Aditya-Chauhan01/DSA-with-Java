package Stack;

import java.util.Stack;

public class insertATanyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // insert 50 at 2nd index;  (1 based indexing)
        Stack<Integer> st_temp = new Stack<>();
        while(st.size() > 1){      // we compare with size so 1 bases index is suitable
            st_temp.push(st.pop());
        }
        st.push(50);
        while(st_temp.size() > 0){
            st.push(st_temp.pop());
        }
        System.out.println(st);
    }
}
