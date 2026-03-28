import java.util.*;
public class PostfixToPrefix {
    public static String postfixToPrefix(String s){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
              (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
             (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                   stack.push(s.charAt(i) + "");
             }
             else{
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String temp = s.charAt(i) + operand2 + operand1;
                stack.push(temp);
             }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        String s = "AB-DE+F*/";
        System.out.println(postfixToPrefix(s));
    }
}