import java.util.*;
public class PrefixToInfix {
    public static String prefixToInfix(String s){
        Stack<String> stack = new Stack<>();
        for(int i = s.length() - 1; i >= 0; i--){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
             (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
            (s.charAt(i) >= '0' && s.charAt(i) <='9')){
                stack.push(s.charAt(i) + "");
            }
            else{
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String temp = '(' + operand1 + s.charAt(i) + operand2 + ')';
                stack.push(temp);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        String s = "*+PQ-MN";
        System.out.println(prefixToInfix(s));
    }
}