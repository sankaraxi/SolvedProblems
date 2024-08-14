package LinkedLists;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        if(nums[0] != nums [1]) return nums[0]; //check for first element
        if(nums[n - 1] != nums[n - 2]) return nums[n - 1]; //check for last element

        int start = 1;
        int end = n - 2;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }

            if(mid % 2 == 0 && nums[mid] == nums[mid+1] || mid % 2 == 1 && nums[mid] == nums[mid - 1]){
                //(even,odd)
                start = mid + 1; //eliminate left and search in right side
            }else{ //(odd,even)
                end = mid - 1; //eliminate rigtht and search in left side
            }
        }
        return -1;
    }
}
