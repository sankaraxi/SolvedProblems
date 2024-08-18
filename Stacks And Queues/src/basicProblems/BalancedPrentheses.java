package basicProblems;
//https://leetcode.com/problems/valid-parentheses/description/
import java.util.Stack;

public class BalancedPrentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char it : s.toCharArray()){
            if (it == '(' || it == '[' || it == '{'){
                st.push(it);
            }else{
                if (st.isEmpty()) return false;

                char ch = st.pop();

                if((it == ')' && ch == '(') || (it == ']' && ch == '[') || (it == '}' && ch == '{')){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
