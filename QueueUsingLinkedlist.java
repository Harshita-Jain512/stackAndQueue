class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLinkedlist {
    private Node head;
    private Node tail;
    int size ;
    public QueueUsingLinkedlist(){
        head = null;
        tail = null;
        size = 0;
    }
    public void push(int x){
        Node element = new Node(x);
        if(head == null){
            head = tail = element;
        }else{
             tail.next = element;
             tail = element;
        }
        size++;
    }
    public int pop(){
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = head.data;
        Node temp = head;
        head = head.next;
        temp = null;
        size--;
        return value;
    }
    public int peek(){
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }
    public static void main(String[] args){
        QueueUsingLinkedlist q = new QueueUsingLinkedlist();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
}