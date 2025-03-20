package LInkedList;

class Node{     // we can use this class everywhere
    int val;
    Node next;

    Node(int val){
        this.val = val;
//        this.next = null;     // it is not necessary bcz by default a node contains null
    }
}
public class TraversalinLinkedList {
//    public static void print(Node temp){    // printing recursively
////        Node temp = Head;
//        if (temp == null){
//            return;
//        }
//        System.out.println(temp.val);
//        temp = temp.next;
//        print(temp);
//    }

    public static void print(Node Head){
        Node temp = Head;                   // i'm creating a reference not a new node (shallow copy)
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);  // Head Node
        Node b = new Node(22);
        Node c = new Node(38);
        Node d = new Node(48);
        Node e = new Node(53);
        // Linking the all nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // print
//        System.out.println(a.next.next.next.next.val);
        print(a);

    }
}
