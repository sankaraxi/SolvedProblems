package LinkedLists;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        int ans = Integer.MAX_VALUE;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(nums[start] <= nums[end]){
                Math.min(ans,nums[start]);//array is already sorted
                break;
            }

            if(nums[start] <= nums[mid]){ // left half is sorted
                ans = Math.min(ans,nums[start]); //pick the minimum
                start = mid + 1; // eliminate the sorted array
            }else{ //right half is sorted
                ans = Math.min(ans,nums[mid]); //pick the minimum
                end = mid - 1; //eliminate the sorted array
            }
        }

        return ans;

    }
}
