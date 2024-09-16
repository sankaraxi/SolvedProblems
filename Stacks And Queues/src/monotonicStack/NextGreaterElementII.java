package monotonicStack;
//https://leetcode.com/problems/next-greater-element-ii/description/
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int[] res = nextGreaterElements(arr);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }

// brute force
//    static int[] nextGreaterElements(int[] nums){
//        int n = nums.length;
//        int[] ans = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < i+n; j++) {
//                int index = j % n;
//
//                if (nums[index] > nums[i]) {
//                    ans[i] = nums[index];
//                    break;
//                }
//                else {
//                    ans[i] = -1;
//                }
//            }
//        }
//        return ans;
//    } //Time complexity: O(n^2)
//    //Space complexity: O(n) used for storing the answer



    static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];


        Stack<Integer> st = new Stack<>();

        for (int i = 2*n-1; i>=0; i--){ // O(2n)

            while(!st.isEmpty() && st.peek() <= nums[i%n]){ // O(2n)
                st.pop();
            }

            if (i<n){
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[i%n]);
        }
        return ans;
    } // Time complexity: O(2n) + O(2n) = O(4n) = O(n)
    // Space complexity: O(2n) for stack and O(n) for the array = O(3n) = O(n)
}
