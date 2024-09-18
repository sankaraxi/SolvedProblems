package basicProblems;

import java.util.Stack;

public class StringReverseUpperLower {
    public static void main(String[] args) {
        String txt = "Hello";
        System.out.println(reverseStr(txt));
    }

    static String reverseStr(String txt){
        String ans = "";

        Stack<Character> st = new Stack<>();

        for (char ch : txt.toCharArray()) {
            st.push(ch);
        }

        final int size = st.size();
        for (int i = 0; i < size; i++) {
            char letter = st.pop();
            if (Character.isLowerCase(letter)){
                ans += Character.toUpperCase(letter);
            }else{
                ans += Character.toLowerCase(letter);
            }
        }


        return ans;
    }
}
