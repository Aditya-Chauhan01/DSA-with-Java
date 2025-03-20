package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class traverseQueueWithPeak {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(2);
        que.add(4);
        que.add(6);
        que.add(8);
        que.add(10);

        Queue<Integer> helper = new LinkedList<>();
        while (!que.isEmpty()){
            System.out.print(que.peek() + " ");
            helper.add(que.remove());
        }
        while (!helper.isEmpty()){
            que.add(helper.remove());
        }
        System.out.println(que);
    }
}
