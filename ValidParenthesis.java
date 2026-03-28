import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else {
                if(st.isEmpty()){
                    return false;
                }if(s.charAt(i) == ')' && st.peek() != '(' ){
                    return false;
                }
                if(s.charAt(i) == '}' && st.peek() != '{' ){
                    return false;
                }
                
                if(s.charAt(i) == ']' && st.peek() != '[' ){
                    return false;
                }
                    st.pop();
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "()";
        System.out.println(isValid(s));
    }
}