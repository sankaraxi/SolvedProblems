package mediumProblems;
//https://leetcode.com/problems/max-consecutive-ones-iii/description/
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
    }
    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int maxLen = 0;
        int len;
        int zeros = 0;

        // while (right < nums.length){
        //     if(nums[right] == 0) zeros++;

        //     while(zeros > k){
        //         if(nums[left]==0) zeros--;
        //         left++;
        //     }

        //     len = right - left + 1;
        //     maxLen = Math.max(maxLen, len);
        //     right++;
        // } // Time Complexity: O(n) + O(n) = O(n)
        // Space Complexity: O(1)

        // most optimal
        while (right < nums.length){
            if(nums[right] == 0) zeros++;

            if (zeros > k){
                if(nums[left]==0) zeros--;
                left++;
            }

            len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            right++;
        } // Time Complexity: O(n)
        // Space Complexity: O(1)
        return maxLen;

        // int maxLen = 0;
        // int zeros;
        // int len;
        // for (int i = 0; i < nums.length; i++){
        //     zeros = 0;
        //     for (int j = i; j < nums.length; j++){
        //         if (nums[j] == 0) zeros++;

        //         if (zeros <= k){
        //             len = j - i + 1;
        //             maxLen = Math.max(maxLen,len);
        //         }else{
        //             break;
        //         }
        //     }
        // } // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        // return maxLen;
    }
}
