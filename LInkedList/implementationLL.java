package LInkedList;

class sLL{
    Node head;
    Node tail;
    int size;

    public void insertATend(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void insertATstart(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void insertATarbitrary(int position,int val){
        if(position == 0){
            insertATstart(val);
            return;
        }
        if(position == size){
            insertATend(val);
            return;
        }
        if(position > size){
            System.out.println("invalid input");
            return;
        }
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            Node a = head;
            for (int i = 0; i < position-1; i++) {
                a = a.next;
            }
            temp.next = a.next;
            a.next = temp;
            size++;
        }
    }
    void size(){
        System.out.println("length is : "+size);
    }

    int get(int idx) throws Error{
        if(idx == size -1) return tail.val;
        if(idx >= size || idx < 0){
            throw new Error("invalid index");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val) throws Error{
        if(idx == size -1) tail.val = val;
        if(idx >= size || idx < 0){
            throw new Error("invalid index");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
    public void display(){
        Node temp = head;                   // i'm creating a reference not a new node (shallow copy)
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteAThead() throws Error{
        if(head == null) throw new Error("List is empty");
        head = head.next;
        size--;
    }

    void deleteATarbitrary(int idx) throws Error {
        if(idx == 0) {
            deleteAThead();
            return;
        }
        if(idx >= size || idx < 0) throw new Error("invalid index");
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        if(temp.next == tail) tail = temp;      // delete at last index
        temp.next = temp.next.next;
        size--;
    }

}
public class implementationLL {
    public static void main(String[] args) {
        sLL s = new sLL();
        s.insertATend(10);
        s.insertATend(20);
        s.insertATstart(30);
        s.insertATstart(40);
        s.display();
        s.insertATarbitrary(2,50);
        s.display();
        s.size();
        System.out.println(s.get(0));
        s.set(3, 90);
        s.display();
        s.deleteATarbitrary(4);
        s.display();
        System.out.println(s.tail.val);
        s.size();
    }
}
