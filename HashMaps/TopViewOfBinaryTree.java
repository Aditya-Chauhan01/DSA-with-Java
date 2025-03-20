package HashMaps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class pair{
    Node node;
     int level;

     pair(Node node, int level){
         this.node = node;
         this.level = level;
     }
}

public class TopViewOfBinaryTree {
    public static void topView(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();    // key: level, value: node's value
        Queue<pair> q = new LinkedList<>();
        int minLevel = Integer.MAX_VALUE, maxLevel = Integer.MIN_VALUE;
        q.add(new pair(root, 0));
        while(q.size() > 0){
            pair temp = q.remove();
            Node n = temp.node;
            int lvl = temp.level;
            minLevel = Math.min(minLevel, lvl);
            maxLevel = Math.max(maxLevel, lvl);
            if( !map.containsKey(lvl)){
                map.put(lvl, n.val);
            }
            if(n.left != null) q.add(new pair(n.left, lvl-1));
            if(n.right != null) q.add(new pair(n.left, lvl+1));
        }
        for(int i=minLevel; i<=maxLevel; i++){
            System.out.println(map.get(i) + " ");   // nodes milenge i.e. ele. ki value
        }

    }
    public static void main(String[] args) {

    }
}
