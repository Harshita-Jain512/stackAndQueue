import java.util.*;
public class PrefixToPostfix {
    public static String prefixToPostfix(String s){
        Stack<String> stack = new Stack<>();
        for(int i = s.length() - 1; i >= 0; i--){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
              (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
              (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                stack.push(s.charAt(i) + "");
              }else{
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String temp = operand1 + operand2 + s.charAt(i);
                stack.push(temp);
              }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String s = "*+AB-CD";
        System.out.println(prefixToPostfix(s));
    }
}
