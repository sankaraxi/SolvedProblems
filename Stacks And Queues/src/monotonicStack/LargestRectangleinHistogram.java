package monotonicStack;
//https://leetcode.com/problems/largest-rectangle-in-histogram/
import java.util.Stack;

public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights){
        Stack<Integer> st = new Stack<>();
        int maxRect = 0;
        int nse = 0;
        int pse = 0;
        int currElement = 0;

        for (int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                nse = i;
                currElement = st.peek();
                st.pop();
                pse = st.isEmpty() ? -1 : st.peek();

                maxRect = Math.max(maxRect,heights[currElement] * (nse - pse -1));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            nse = heights.length;
            currElement = st.peek();
            st.pop();
            pse = st.isEmpty() ? -1 : st.peek();

            maxRect = Math.max(maxRect,heights[currElement] * (nse - pse - 1));
        }

        return maxRect;
    }// Time Complexity: O(n) + O(n) = O(n)
    // Space Complexity: O(n)
}
