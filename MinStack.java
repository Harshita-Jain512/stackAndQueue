import java.util.Stack;
public class MinStack {
    Stack<int[]> st = new Stack<>();
    public void push(int x){
        if(st.isEmpty()){
            st.push(new int[]{x, x});
        }
        int min = Math.min(getMin(), x);
        st.push(new int[] {x, min});
    }
    public void pop(){
        st.pop();
    }
    public int getMin(){
        return st.peek()[1];
    }
    public int top(){
        return st.peek()[0];
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
    }
}