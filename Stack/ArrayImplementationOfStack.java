package Stack;

class Stack{
    private int[] arr = new int[5];
    private int top = 0;
    private int size;

    public void push(int ele){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[top] = ele;
        top++;
        System.out.println();
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        int remove = arr[top-1];
        System.out.println(remove + " element is popped");
        top--;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top-1];
    }

    public boolean isFull(){
        if(arr.length == top){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top == 0){
            return true;
        }
        return false;
    }

    void display(){
        for (int i = 0; i <= top-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class ArrayImplementationOfStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(82);
        st.push(56);
        st.push(48);
        st.push(36);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.display();
        st.push(4);
        st.display();
        System.out.println(st.isFull());
        st.pop();
        System.out.println(st.isEmpty());
        st.display();

    }
}
