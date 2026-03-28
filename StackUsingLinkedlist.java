import java.util.*;
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLinkedlist {
   private Node head;
   int size; 
   public StackUsingLinkedlist(){
    head = null;
    size = 0;
   }
   public void push(int x){
    Node element = new Node(x);
    element.next = head;
    head = element;
    size++;
   }
   public int pop(){
    if(head == null){
        System.out.println("Stack is empty");
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
        System.out.println("Stack is empty");
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
        StackUsingLinkedlist s = new StackUsingLinkedlist();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
    }
}
