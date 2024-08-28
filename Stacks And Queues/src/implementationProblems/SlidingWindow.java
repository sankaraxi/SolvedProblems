package implementationProblems;
//https://leetcode.com/problems/sliding-window-maximum/description/
import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 2, 1, 6};
        int k = 3;
        System.out.println(maxSlidingWindow(arr,k));
    }

    static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= nums.length - k; i++) {
            int maxi = nums[i];
            for (int j = i; j < i+k; j++) {
                maxi = Math.max(maxi,nums[j]);
            }
            ans.add(maxi);
        }

        return ans;
    }
}
