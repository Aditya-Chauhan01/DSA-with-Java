package Stack;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
class LinStack{
    Node head = null;
    int size;

    public void push(int val){      // space is unlimited so no need to check isFull;
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    public int size(){
        return size;
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        int ele = head.val;
        System.out.println("deleted node is "+ ele);
        head = head.next;
        size--;
    }

    public int peek(){
        return head.val;
    }

    boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }

    void display(){
        RecursiveDisplay(head);
        System.out.println();
    }
    void RecursiveDisplay(Node h){
        if(h == null) return;
        RecursiveDisplay(h.next);
        System.out.print(h.val + " ");
    }
}

public class LinkedListimplementation {
    public static void main(String[] args) {
        LinStack L = new LinStack();
        L.push(1);
        L.push(2);
        L.push(3);
        L.push(4);
        L.push(5);
        L.display();
        L.pop();
        System.out.println(L.peek());
        System.out.println(L.size());
        System.out.println(L.isEmpty());
        L.display();
    }
}
