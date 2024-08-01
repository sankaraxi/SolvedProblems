package BSonAnswers;
//https://leetcode.com/problems/split-array-largest-sum/description/
import java.util.Arrays;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 6, 2, 3};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }

    private static int splitArray(int[] nums, int k) {
        int start = Arrays.stream(nums).max().getAsInt();
        int end = sum(nums);

        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            int countArray = countArray(nums,mid);

            if(countArray <= k){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

//    private static int splitArray(int[] nums, int m) {
//        int low = Arrays.stream(nums).max().getAsInt();
//        int high = sum(nums);
//
//        for (int sum = low; sum <= high; sum++){
//            int countArray = countArray(nums,sum);
//
//            if(countArray == m){
//                return sum;
//            }
//        }
//        return -1;
//    }

    private static int countArray(int[] nums, int sum) {
        int arrays = 1;
        int arraySum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(arraySum + nums[i] <= sum){
                arraySum += nums[i];
            }else{
                arrays++;
                arraySum = nums[i];
            }
        }

        return arrays;
    }

    private static int sum(int[] nums){
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        return sum;
    }
}
