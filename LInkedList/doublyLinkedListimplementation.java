package LInkedList;

class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;

    public void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    public void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    public void insertATarbitrary(int idx,int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx > size){
            System.out.println("invalid input");
            return;
        }
        dNode temp = new dNode(val);
        if(head == null) head = tail = temp;
        else{
            dNode a = head;
            for (int i = 0; i < idx-1; i++) {
                a = a.next;
            }
            dNode b = a.next;
            temp.next = b;
            b.prev = temp;
            a.next = temp;
            temp.prev = a;
            size++;
        }
    }
    void deleteAThead() throws Error{
        if(head == null) throw new Error("List is empty");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteATtail() throws Error{
        if(head == null) throw new Error("List is empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteATarbitrary(int idx) throws Error {
        if(idx == 0) {
            deleteAThead();
            return;
        }
        if(idx == size-1){
            deleteATtail();
            return;
        }
        if(idx >= size || idx < 0) throw new Error("invalid index");
        dNode temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        temp.next.next.prev = temp;
        temp.next = temp.next.next;
        /*
        * we can write this:
        * temp.next = temp.next.next;
        * temp= temp.next;
        * temp.prev = temp.prev.prev;
        */
        size--;
    }

    public void display(){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class doublyLinkedListimplementation {
    public static void main(String[] args) {
        DLL D = new DLL();
        D.insertAtTail(10);
        D.insertAtTail(20);
        D.insertAtTail(30);
        D.display();
        D.insertAtTail(40);
        D.display();
        D.insertAtHead(50);
        D.insertAtHead(60);
        D.display();
        D.insertATarbitrary(0,88);
        D.display();
        D.insertATarbitrary(7,77);
        D.display();
        D.deleteAThead();
        D.deleteATtail();
        D.display();
        D.deleteATarbitrary(4);
        D.display();
        System.out.println(D.size);
    }
}
