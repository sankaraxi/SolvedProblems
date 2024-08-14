package LinkedLists;

public class RotatedBinarySearchDuplicates {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,7,1,2,3,5,5,5};
        int target = 7;
        System.out.println(search(arr,target));
    }

    //for returning index
//    static int search(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//
//            if (nums[mid] == target) return mid;
//            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
//                start = start + 1;
//                end = end - 1;
//                continue;
//            }
//
//            if(nums[start] <= nums[mid]){
//                if(nums[start] <= target && target <= nums[mid]){
//                    end = mid - 1;
//                }else{
//                    start = mid + 1;
//                }
//            }else{
//                if(nums[mid] <= target && target <= nums[end]){
//                    start = mid + 1;
//                }else{
//                    end = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }

    // for returning true or false
    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return true;
            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
                start = start + 1;
                end = end - 1;
                continue;
            }

            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
