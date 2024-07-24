package mediumProblems;
//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(longestSubArraySum(arr, target));
    }


     //better solution and an optimal solution if array contains negative numbers also
//    private static int longestSubArraySum(int[] arr, int target) {
//        int n = arr.length; // size of the array.
//
//        Map<Long, Integer> preSumMap = new HashMap<>();
//        long sum = 0;
//        int maxLen = 0;
//        for (int i = 0; i < n; i++) {
//            //calculate the prefix sum till index i:
//            sum += arr[i];
//
//            // if the sum = k, update the maxLen:
//            if (sum == target) {
//                maxLen = Math.max(maxLen, i + 1);
//            }
//
//            // calculate the sum of remaining part i.e. x-k:
//            long rem = sum - target;
//
//            //Calculate the length and update maxLen:
//            if (preSumMap.containsKey(rem)) {
//                int len = i - preSumMap.get(rem);
//                maxLen = Math.max(maxLen, len);
//            }
//
//            //Finally, update the map checking the conditions:
//            if (!preSumMap.containsKey(sum)) {
//                preSumMap.put(sum, i);
//            }
//        }
////
//        return maxLen;
//    }//Time Complexity: O(N), N = size of the given array.
//    //Space Complexity: O(N), used to store the prefix sum.

    //optimal solution if array contains only positive numbers and zero
    static int longestSubArraySum(int[] arr, int target) {
        int left = 0;
        int right = 0;

        int sum = arr[0];
        int maxLen = 0;

        while (right < arr.length){
            while(sum > target && left<=right){
                sum = sum - arr[left];
                left++;
            }

            if(sum == target){
                maxLen = Math.max(maxLen,right-left+1);
            }

            right++;
            if (right < arr.length) sum = sum + arr[right];
        }

        return maxLen;
    }
}
