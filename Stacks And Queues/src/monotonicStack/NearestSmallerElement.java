package monotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};

        System.out.println(Arrays.toString(nearestSmallerElement(arr)));
    }
    //brute
//    private static int[] nearestSmallerElement(int[] arr) {
//        int[] ans = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0){
//                ans[i] = -1;
//                continue;
//            }
//            for (int j = i-1; j >=0 ; j--) {
//                if (arr[j] < arr[i]) {
//                    ans[i] = arr[j];
//                    break;
//                } else {
//                    ans[i] = -1;
//                }
//            }
//
//        }
//        return ans;
//    } // Time Complexity : O(N * N)
//    // Space Complexity : O(N)

    private static int[] nearestSmallerElement(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && st.peek()>=arr[i]) {
                st.pop();
            }

            ans[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
}
