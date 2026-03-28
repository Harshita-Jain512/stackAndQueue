import java.util.*;
public class QueueUsingStack {
    Stack<Integer>input;
    Stack<Integer>output;
    public QueueUsingStack(){
        input = new Stack<>();
        output = new Stack<>();
    }
    public void push(int x){
        System.out.println(input.push(x));
    }
    public int pop(){
        if(output.empty())
            while(input.empty() == false){
                output.push(input.pop());
            }
                int x = output.pop();
                return x;
    }
    public int peek(){
       if(output.empty())
            while(input.empty() == false){
                output.push(input.pop());
            }
                int x = output.peek();
                return x; 
    }
    public boolean isEmpty(){
        return input.empty() && output.empty();
    }
    public static void main(String[] args){
        QueueUsingStack q = new QueueUsingStack();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
