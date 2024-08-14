package LinkedLists;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 1;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;

            // either one of the array will be sorted
            if (nums[start] <= nums[mid]){ //left array is sorted
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1; //target is in the range [start,mid]
                }else{
                    start = mid + 1; //not in  range
                }
            }else{ //right array is sorted
                if (nums[mid] <= target && target <= nums[end]){
                    start = mid + 1; //target is in the range [mid,high]
                }else{
                    end = mid - 1; //not in range
                }
            }
        }
        return -1;
    }
}
