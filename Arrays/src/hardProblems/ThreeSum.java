package hardProblems;
//https://leetcode.com/problems/3sum/description/
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    // my brute force but didnt work
//    static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> ansSet = new HashSet<>();
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i+1; j < nums.length; j++){
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
//                        temp.sort(null);
//                        ansSet.add(temp);
//                    }
//                }
//            }
//        }
//        List<List<Integer>> ans = new ArrayList<>(ansSet);
//        return ans;
//    } //O(N^3) Time Complexity
    //O(Number of Triplets) Space Complexity


//    //better solution
//    static List<List<Integer>> threeSum(int[] arr) {
//        Set<List<Integer>> st = new HashSet<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            Set<Integer> hashset = new HashSet<>();
//            for (int j = i + 1; j < arr.length; j++) {
//                //Calculate the 3rd element:
//                int third = -(arr[i] + arr[j]); //arr[k]
//
//                //Find the element in the set:
//                if (hashset.contains(third)) {
//                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                    temp.sort(null);
//                    st.add(temp);
//                }
//                hashset.add(arr[j]);
//            }
//        }
//
//        // store the set elements in the answer:
//        List<List<Integer>> ans = new ArrayList<>(st);
//        return ans;
//    } // O(N^2) Time Complexity
//    //O(N)+2*O(Number of Triplets) Space Complexity

    // optimal solution
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length - 1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }//O(N Log N) + O(N^2) Time Complexity  - sorting + two pointer
    //O(Number of Triplets) Space Complexity
}
