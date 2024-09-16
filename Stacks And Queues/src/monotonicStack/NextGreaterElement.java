package monotonicStack;
//https://leetcode.com/problems/next-greater-element-i/description/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = {6,0,8,1,3};

        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};
//        System.out.println(Arrays.toString(nextGreaterElement(arr)));
        System.out.println(Arrays.toString(nextGreaterElement(arr1,arr2)));
    }
//// brute force
//    static int[] nextGreaterElement(int[] arr){
//
//        int[] ans = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1){
//                ans[i] = -1;
//                break;
//            }
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] > arr[i]) {
//                    ans[i] = arr[j];
//                    break;
//                }else{
//                    ans[i] = -1;
//                }
//            }
//        }
//
//        return ans;
//    } // Time complexity: O(n^2)
//    // Space complexity: O(n) used for storing the answer

    static int[] nextGreaterElement(int[] arr){

        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >=0 ; i--) {

            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(arr[i]);
        }

        return ans;
    } // Time Complexity: O(n) + O(n) = O(2n)
    // Space Complexity: O(2n) for an array and for a stack

    static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
