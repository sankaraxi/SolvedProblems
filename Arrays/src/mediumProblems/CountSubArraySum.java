package mediumProblems;
//https://leetcode.com/problems/subarray-sum-equals-k/description/
import java.util.HashMap;
import java.util.Map;

public class CountSubArraySum {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int[] arr = {3,-3,1,1,1};
        int k = 3;
        System.out.println(countSubArraySum(arr,k));
    }

    static int countSubArraySum(int[] arr, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int count = 0;
        int sum = 0;
        mpp.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int rem = sum - k;
            count = count + mpp.getOrDefault(rem,0);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
