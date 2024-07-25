package easyProblems;
//https://leetcode.com/problems/max-consecutive-ones/description/
public class ConsecutiveOnes{
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

//  my brute force also optimal solution
    static int findMaxConsecutiveOnes(int[] nums) {
        int maxlen = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                maxlen = Math.max(maxlen,count);
            }else{
                count = 0;
            }
        }
        return maxlen;
    } // O(N) where N is the number of elements in the array
    //Space Complexity: O(1)
}
