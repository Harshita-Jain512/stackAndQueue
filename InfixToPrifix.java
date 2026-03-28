import java.util.*;
public class InfixToPrifix {
    public static int precedence(char operator){
        if(operator == '+' || operator == '-'){
            return 1;
        } 
         if(operator == '*' ||  operator == '/'){
            return 2;
        }
         if(operator == '^'){
            return 3;
        }
            return -1;
    }
    public static String infixToPrefix(String infix){
        StringBuilder prefix = new StringBuilder();
        StringBuilder sb = new StringBuilder(infix);
        sb.reverse();
        for(int i = 0; i< sb.length(); i++){
            if(sb.charAt(i) == '('){
                sb.setCharAt(i,')');
            }
            else if(sb.charAt(i) == ')'){
                sb.setCharAt(i,'(');
            }
        }
        sb.toString();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < sb.length(); i++){
            if((sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') || 
            (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') ||
        (sb.charAt(i) >= '0' && sb.charAt(i) <= '9')) {
            prefix.append(sb.charAt(i));
        }
        else if(sb.charAt(i) == '('){
            stack.push(sb.charAt(i));
        }
        else if(sb.charAt(i) == ')'){
            while(!stack.isEmpty() && stack.peek() != '('){
                prefix.append(stack.peek());
                stack.pop();
            }
            stack.pop();
        }
        else {
            while(!stack.isEmpty() && precedence(sb.charAt(i)) < precedence(stack.peek())){
                prefix.append(stack.peek());
                stack.pop();
            }
            stack.push(sb.charAt(i));
        }
        }
        while(!stack.isEmpty()){
            prefix.append(stack.peek());
            stack.pop();
        }
           return prefix.reverse().toString();
    }
    public static void main(String[] args) {
        String infix = "(A+B)*C-D+F";
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);
    }
}
