package Tree;

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
public class NodeOfTree {
    /* Note: we can traverse level wise (BFS) using DFS(preorder, inorder, postorder) */
    static int n;

    public static void nthLevel(Node root, int level){      // print the nodes of the particular level using dfs
    if(root == null) return;
    nthLevel(root.left, level +1);
    if(level == n) System.out.print(root.val + " ");
    nthLevel(root.right, level+1);
    }
    public static void BFStraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while (q.size() > 0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
        System.out.println();
    }
    public static int levels(Node root){    // No. of levels of the tree
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    public static int sizeOfTree(Node root){    // size of the tree(no. of nodes)
        if(root == null) return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }
    public static int maxInTree(Node root){         // get maximum value in tree
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val; int b = maxInTree(root.left); int c = maxInTree(root.right);
        return Math.max(a, Math.max(b,c));
    }
    public static int productNonZeros(Node root){       // product non zeros node
        if(root == null) return 1;
        if(root.val != 0) return root.val * productNonZeros(root.left) * productNonZeros(root.right);
        else return productNonZeros(root.left) * productNonZeros(root.right);
    }
    public static int product(Node root){       // product of all Nodes
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static int sum(Node root){       // sum of all Nodes
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static void display(Node root){     // print the all nodes
        if(root == null) return;

        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);       // this is root node
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(0);
        Node f = new Node(0);
        // link

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

//        e.val = 5; f.val = 6; b.val = 2;

        display(a);
        System.out.println();
        System.out.println("sum is: " + sum(a));
        System.out.println("product is: " + product(a));
        System.out.println("product of non Zeros is: " + productNonZeros(a));
        System.out.println("max in tree is: " + maxInTree(a));
        System.out.println("size of tree is: " + sizeOfTree(a));
        System.out.println("levels of tree is : " + levels(a));
//        BFStraversal(a);
//        nthLevel(a,0); // currently in 0th level
        for (int i = 0; i < levels(a); i++) {   // BFS travesal using DFS
            n = i;
            nthLevel(a,0);
            System.out.println();
        }
    }
}
