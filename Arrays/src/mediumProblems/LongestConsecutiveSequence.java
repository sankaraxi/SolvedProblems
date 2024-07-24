package mediumProblems;
//https://leetcode.com/problems/longest-consecutive-sequence/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(arr));
    }
    
    //brute force solution
//    static int longestConsecutive(int[] nums) {
//        int n = nums.length; //size of array
//        int longest = 1;
//        //pick a element and search for its
//        //consecutive numbers:
//        for (int i = 0; i < n; i++) { //O(N)
//            int x = nums[i];
//            int count = 1;
//            //search for consecutive numbers
//            //using linear search:
//            while (linearSearch(nums, x + 1) == true) { //O(N)
//                x += 1;
//                count += 1;
//            }
//            longest = Math.max(longest, count);
//        }
//        return longest;
//    }
//    static boolean linearSearch(int []a, int num) {
//        int n = a.length; //size of array
//        for (int i = 0; i < n; i++) {
//            if (a[i] == num)
//                return true;
//        }
//        return false;
//    }//Time Complexity: O(N^2), N = size of the given array.
//    //Space Complexity: O(1), No extra space is used.

    //better solution
//    static int longestConsecutive(int[] nums) {
//        int n = nums.length;
//        if (n == 0) return 0;
//
//        //sort the array:
//        Arrays.sort(nums); //O(NlogN)
//        int lastSmaller = Integer.MIN_VALUE;
//        int count = 0;
//        int longest = 1;
//
//        //find longest sequence:
//        for (int i = 0; i < n; i++) { //O(N)
//            if (nums[i] - 1 == lastSmaller) {
//                //a[i] is the next element of the
//                //current sequence.
//                count += 1;
//                lastSmaller = nums[i];
//            } else if (nums[i] != lastSmaller) { // this is to start a new sequence
//                count = 1;
//                lastSmaller = nums[i];
//            }
//            longest = Math.max(longest, count);
//        }
//        return longest;
//    }//Time Complexity: O(NlogN) + O(N), N = size of the given array.
//    //Space Complexity: O(1), No extra space is used.


    //optimal solution
    static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) { // it -1 is not present in the set then it is the starting number of a sequence
                // find consecutive numbers
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
