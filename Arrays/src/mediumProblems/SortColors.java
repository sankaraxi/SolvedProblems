package mediumProblems;
//https://leetcode.com/problems/sort-colors/description/
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //Brute Force Solution using an any of the sorting algorithms
//    static void sortColors(int[] nums) {
//        for (int i = 0; i < nums.length - 1;i++ ){
//            for (int j = i+1; j > 0;j--){
//                if(nums[j]<nums[j-1]){
//                    swapArr(nums,j,j-1);
//                }
//            }
//        } //O(N^2) where N is the number of elements in the array
//        //Space Complexity: O(1)
//    }

    //Better Solution
//    static void sortColors(int[] nums) {
//        int zeros = 0;
//        int ones = 0;
//        int twos = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==0){
//                zeros++;
//            }else if(nums[i]==1){
//                ones++;
//            }else{
//                twos++;
//            } //O(N) where N is the number of elements in the array
//        }
//
//        for (int i = 0; i < zeros; i++) {
//            nums[i] = 0;
//        }
//        for (int i = zeros; i < zeros+ones; i++) {
//            nums[i] = 1;
//        }
//        for (int i = zeros+ones; i < nums.length; i++) {
//            nums[i] = 2;
//        } // for all the above three loops O(N) where N is the number of elements in the array
//    }
    //Overall Time Complexity: O(2N) where N is the number of elements in the array
    //Space Complexity: O(1)

    //Optimal Solution using Dutch National Flag Algorithm
        static void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while (mid <= high){
                if (nums[mid] == 0){
                    swapArr(nums,low,mid);
                    mid++;
                    low++;
                }else if(nums[mid] == 1){
                    mid++;
                }else{
                    swapArr(nums,mid,high);
                    high--;
                }
            }
        }

        static void swapArr(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        //Overall Time Complexity: O(N) where N is the number of elements in the array
        //Space Complexity: O(1)
}
