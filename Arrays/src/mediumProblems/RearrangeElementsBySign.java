package mediumProblems;
//https://leetcode.com/problems/rearrange-array-elements-by-sign/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr ={-1,1};
        rearrange(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rearrange(arr)));
    }

    //Brute Force Approach
//    static void rearrange(int[] arr) {
//        ArrayList<Integer> postives = new ArrayList<>();
//        ArrayList<Integer> negatives = new ArrayList<>();
//
//        for(int i = 0; i < arr.length; i++){ //O(N)
//            if(arr[i] > 0){
//                postives.add(arr[i]);
//            }else{
//                negatives.add(arr[i]);
//            }
//        }
//
//        for (int i = 0; i < arr.length / 2 ; i++) {// O(N/2) time complexity where N/2 is the length of the array
//            arr[2 * i] = postives.get(i);
//            arr[2 * i+1] =negatives.get(i);
//        } // Time Complexity : O(N) + O(N/2)
//    }//Space Complexity: O(N)

    //optimal solution
    static int[] rearrange(int[] nums) {
        int postiveIndex = 0;
        int negativeIndex = 1;

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                ans[postiveIndex] =  nums[i];
                postiveIndex+=2;
            }else{
                ans[negativeIndex] = nums[i];
                negativeIndex+=2;
            }
        }
        return ans;
    } //O(N) Time Complexity
    //O(N) Space Complexity
}
