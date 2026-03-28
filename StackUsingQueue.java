import java.util.*;
public class StackUsingQueue {
    Queue<Integer> q1;
    public StackUsingQueue(){
        q1 = new LinkedList<>();
    }
    public void push(int x){
        q1.add(x);
        for(int i = 0; i < q1.size() - 1; i++){
            q1.add(q1.remove());
        }
    }
    public int pop(){
        return q1.remove();
    }
    public int peek(){
        return q1.peek();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public static void main(String[] args){
        StackUsingQueue s = new StackUsingQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
