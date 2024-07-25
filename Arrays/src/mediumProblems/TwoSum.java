package mediumProblems;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            int rem = target - a;
            if(mpp.containsKey(rem)){
                return new int[] {i,mpp.get(rem)};
            }
            mpp.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
