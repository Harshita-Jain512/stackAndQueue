public class StackUsingArray{
    int []stack;
    int size;
    int top;
    StackUsingArray(int s){
        size = s;  // Assign the value of parameter s to the class variable size. 
        stack = new int[size];
        top = -1;
    }
    public void push(int x){
        if(top == size - 1){
            System.out.println("stack overflow");
        } else {
            top++;
            stack[top] = x;
            System.out.println(x + "pushed into the stack");
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("stack is empty");
        } else {
            int x = stack[top];
            top--;
            System.out.println(x + "popped from the stack");
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("stack is empty");
        }else {
            System.out.println("top element is : " + stack[top]);
        }
    }
    void display(){
        if(top == -1){
            System.out.println("stack is empty");
        }else {
            for(int i = top; i>=0; i--){
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        s.peek();
        s.display();
    }
}