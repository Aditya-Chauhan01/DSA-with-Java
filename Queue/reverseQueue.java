package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(2);
        que.add(4);
        que.add(6);
        que.add(8);
        que.add(10);
        System.out.println(que);
        Stack<Integer> st = new Stack<>();      // for the reverse of queue, stack require
        while(que.size() > 0){  // while(!que.isEmpty())
            st.push(que.remove());
        }
        while(!st.isEmpty()){  // while(!que.isEmpty())
            que.add(st.pop());
        }
        System.out.println(que);
    }
}
