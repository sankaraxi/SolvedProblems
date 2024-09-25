package implementationProblems;
//https://leetcode.com/problems/sliding-window-maximum/description/
import java.util.*;

public class MaximumSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 2, 1, 6};
        int k = 3;
//        System.out.println(maxSlidingWindow(arr,k));
        System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
    }

//    static List<Integer> maxSlidingWindow(int[] nums, int k) {
//        List<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i <= nums.length - k; i++) {
//            int maxi = nums[i];
//            for (int j = i; j < i+k; j++) {
//                maxi = Math.max(maxi,nums[j]);
//            }
//            ans.add(maxi);
//        }
//
//        return ans;
//    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        //optimal
        int n = nums.length;
        int max[] = new int[n-k+1];
        int r = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++) {
            // remove numbers out of boundary (out of range k)
            if(!q.isEmpty() && q.peek() == i-k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless;
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);

            if(i >= k-1) {
                max[r] = nums[q.peek()];
                r++;
            }

        }

        return max;
    }
}
