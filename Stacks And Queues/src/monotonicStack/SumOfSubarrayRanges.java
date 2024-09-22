package monotonicStack;
//https://leetcode.com/problems/sum-of-subarray-ranges/description/
import java.util.Stack;


public class SumOfSubarrayRanges {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subArrayRanges(arr));
    }
    public static long subArrayRanges(int[] nums) {

        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);

    }

    public static long sumSubarrayMaxs(int[] arr) {

        long sum = 0;
        long mod = (long)(1e9 + 7);
        int[] prevGE = findPGEAndE(arr); // previous smaller and equal element
        int[] nextGE = findNGE(arr);

        for(int i = 0; i < arr.length; i++){

            long left = i - prevGE[i];
            long right = nextGE[i] - i;

            sum = (sum+left*right*(long)arr[i]);
        }

        return sum;
    }

    public static int[] findNGE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >=0; i--){
            while (!st.empty() && arr[st.peek()] < arr[i]){
                st.pop();
            }

            ans[i] = st.empty() ? arr.length : st.peek();
            st.push(i);
        }

        return ans;
    }

    public static int[] findPGEAndE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++){
            while (!st.empty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            ans[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    public static long sumSubarrayMins(int[] arr) {

        long sum = 0;
        long mod = (long)(1e9 + 7);
        int[] prevSE = findPSEAndE(arr); // previous smaller and equal element
        int[] nextSE = findNSE(arr);

        for(int i = 0; i < arr.length; i++){

            long left = i - prevSE[i];
            long right = nextSE[i] - i;

            sum = (sum+left*right*(long)arr[i]);
        }

        return sum;
    }

    public static int[] findNSE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >=0; i--){
            while (!st.empty() && arr[st.peek()] > arr[i]){
                st.pop();
            }

            ans[i] = st.empty() ? arr.length : st.peek();
            st.push(i);
        }

        return ans;
    }

    public static int[] findPSEAndE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++){
            while (!st.empty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            ans[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    } // Time Complexity: O(10N) = O(N)
    // Space Complexity: O(8N) = O(N)
}
