package mediumProblems;
//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarraySum(nums));
    }

    //bruteforce solution
//    static int maximumSubarraySum(int[] nums) {
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                int sum = 0;
//                for (int k = i; k < j; k++) {
//                    sum+=nums[k];
//                    if (sum>maxSum){
//                        maxSum = sum;
//                    }
//                }
//            }
//        }
//        return maxSum;
//    } // Time-Complexity : O(N^3) because of three for loops
//    // Space-Complexity : O(1)

    //Better Solution  we have reduced a for loop
//    static int maximumSubarraySum(int[] nums) {
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++){
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum+=nums[j];
//                if (sum>maxSum){
//                    maxSum = sum;
//                }
//            }
//        }
//        return maxSum;
//    } // Time-Complexity : O(N^2) because of two for loops
    // Space-Complexity : O(1)

    //optimal solution
    static int maximumSubarraySum(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if(sum > maximum){
                maximum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        // this is used if question not to return negative maximums / empty sub arrays
//        if (maximum < 0){
//            maximum = 0;
//        }

        return maximum;
    }// Time-Complexity : O(N)
    // Space-Complexity : O(1)
}
