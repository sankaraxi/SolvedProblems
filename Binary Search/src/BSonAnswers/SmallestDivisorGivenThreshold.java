package BSonAnswers;
//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/  //LeetCode 1283
import java.util.Arrays;
import java.util.Timer;

public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }

//    static int smallestDivisor(int[] nums, int threshold) {
//        int max = Arrays.stream(nums).max().getAsInt();
//        int ans = 0;
//
//        for (int i = 1; i <= max; i++){
//            int sum = 0;
//            for (int j = 0; j < nums.length; j++){
//                sum  = (int) (sum + Math.ceil((double)nums[j]/(double)i)); //sum+=(nums[j]-1)/i+1;
//            }
//            if (sum <= threshold){
//                ans = i;
//                break;
//            }
//        }
//        return ans;
//    } //O(n^2)
//    //space O(1)

    //optimal solution
    static int smallestDivisor(int[] nums, int threshold) {

        int start = 1;
        // int end = Arrays.stream(nums).max().getAsInt();
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            end = Math.max(end, nums[i]);
        }
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            int sum = sum(nums,mid);
            if (sum <= threshold){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    static int sum(int[] nums, int i){
        int sum = 0;
        for (int j = 0; j < nums.length; j++){
            sum+=(nums[j]-1)/i+1; //sum  = (int) (sum + Math.ceil((double)nums[j]/(double)i));
        }
        return sum;
    } // time O(n) * O(log(max)) = O(nlog(max))
    //space O(1)
}
