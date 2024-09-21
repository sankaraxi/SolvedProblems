package monotonicStack;

import java.util.Stack;

public class SumofSubarrayMinimums {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};

        System.out.println(sumSubarrayMins(arr));
    }

//    public static int sumSubarrayMins(int[] arr) {
//
//        int sum = 0;
//        int mod = (int)(1e9 + 7);
//
//        for (int i = 0; i < arr.length; i++){
//            int mini = arr[i];
//            for (int j = i; j < arr.length; j++){
//                mini = Math.min(mini,arr[j]);
//                sum = (sum + mini) % mod;
//            }
//        }
//
//        return sum;
//    } // time complexity : O(N * N)
//    //space complexity : O(1)

    public static int sumSubarrayMins(int[] arr) {

        long sum = 0;
        int mod = (int)(1e9 + 7);
        int[] prevSE = findPSEAndE(arr); // previous smaller and equal element
        int[] nextSE = findNSE(arr);

        for(int i = 0; i < arr.length; i++){

            int left = i - prevSE[i];
            int right = nextSE[i] - i;

            sum = (sum+(long)left*right*arr[i])%mod;
        }

        return (int)sum;

        // for (int i = 0; i < arr.length; i++){
        //     int mini = arr[i];
        //     for (int j = i; j < arr.length; j++){
        //         mini = Math.min(mini,arr[j]);
        //         sum = (sum + mini) % mod;
        //     }
        // }

        // return sum;

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
    }
}
