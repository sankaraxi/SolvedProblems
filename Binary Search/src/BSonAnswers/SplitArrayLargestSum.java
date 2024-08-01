package BSonAnswers;
//https://leetcode.com/problems/split-array-largest-sum/description/
import java.util.Arrays;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }

    private static int splitArray(int[] nums, int m) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = sum(nums);

        for (int sum = low; sum <= high; sum++){
            int countArray = countArray(nums,sum);

            if(countArray == m){
                return sum;
            }
        }
        return -1;
    }

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
