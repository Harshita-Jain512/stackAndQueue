import java.util.Stack;
public class InfixToPostfix {
    public static int precedence(char operator){
        if(operator == '+' || operator == '-'){
            return 1;
        }else if(operator == '*' || operator == '/'){
            return 2;
        }else if(operator == '^'){
            return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack();
        for(int i = 0; i < infix.length(); i++) {
            if((infix.charAt(i) >= 'A' && infix.charAt(i) <= 'Z') || 
            (infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z') ||
             (infix.charAt(i) >= '0' && infix.charAt(i) <= '9')
            ) {
                postfix.append(infix.charAt(i));
        }else if(infix.charAt(i) == '('){
            stack.push(infix.charAt(i));
        }else if(infix.charAt(i) == ')'){
            while(!stack.isEmpty() && stack.peek()  != '('){
                postfix.append(stack.peek());
                stack.pop();
            }
            stack.pop();
        }else {
                while(!stack.isEmpty() && precedence(infix.charAt(i)) <= precedence(stack.peek())){
                    postfix.append(stack.peek());
                    stack.pop();
                }
                stack.push(infix.charAt(i));
        }
            }
        while(!stack.isEmpty()){
            postfix.append(stack.peek());
            stack.pop();
        }
    return postfix.toString();
}
    public static void main(String[] args) {
        String infix = "a+b*c-d";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
    }
}