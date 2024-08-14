package LinkedLists;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class SortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }
    static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i+1)%nums.length]){
                count++;
            }
        }
        return count <= 1;
    }
}
