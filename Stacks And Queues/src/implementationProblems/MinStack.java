package implementationProblems;
//https://leetcode.com/problems/min-stack/
import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {

    }
    class MinStack5 {

        Stack<Long> st = new Stack<>();
        long mini;

        public MinStack5() {
            mini = Integer.MAX_VALUE;
        }

        public void push(int val) {
            long value = val;
            if (st.empty()){
                mini = value;
                st.push(value);
            }else{
                if(value > mini) st.push(value);
                else{
                    st.push(2*value - mini);
                    mini = value;
                }
            }
        }

        public void pop() {
            if (st.empty()) return;
            long x = st.peek();
            st.pop();

            if(x < mini) mini = 2 * mini - x;
        }

        public int top() {
            if (st.empty()) return -1;

            long x = st.peek();

            if (mini < x) return (int) x;

            return (int) mini;
        }

        public int getMin() {
            return (int) mini;
        }
    }
}


//brute
//class Pair {
//    int x, y;
//    Pair(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
//class MinStack {
//    Stack < Pair > st;
//    public MinStack() {
//        st = new Stack < > ();
//    }
//
//    public void push(int x) {
//        int min;
//        if (st.isEmpty()) {
//            min = x;
//        } else {
//            min = Math.min(st.peek().y, x);
//        }
//        st.push(new Pair(x, min));
//    }
//
//    public void pop() {
//        st.pop();
//    }
//
//    public int top() {
//        return st.peek().x;
//    }
//
//    public int getMin() {
//        return st.peek().y;
//    }
//}
