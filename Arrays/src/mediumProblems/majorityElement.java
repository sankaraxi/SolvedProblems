package mediumProblems;
//https://leetcode.com/problems/majority-element/description/
import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {8,8,7,7,7};
        System.out.println(majorityElement(arr));
    }
    //brute force solution
//    static int majorityElement(int[] arr){
//
//        int majorityElement = arr.length / 2;
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//                if (count > majorityElement) {
//                    return arr[i];
//                }
//            }
//        }
//        return -1;
//    } // O(N^2) where N is the number of elements in the array
    //Space Complexity: O(1)


    //better solution   using hashmap
//    static int majorityElement(int[] arr){
//        //size of the given array:
//        int n = arr.length;
//
//        //declaring a map:
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//
//        //storing the elements with its occurnce:
//        for (int i = 0; i < n; i++) {
//            int value = mpp.getOrDefault(arr[i], 0);
//            mpp.put(arr[i], value + 1);
//        }
//
//        //searching for the majority element:
//        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//            if (it.getValue() > (n / 2)) {
//                return it.getKey();
//            }
//        }
//
//        return -1;
//    }
    //Time Complexity: O(N log N)+ O(N) where N is the number of elements in the array
    //Space Complexity: O(N) where N is the number of elements in the array

    //Optimal Solution using Moore's Voting Algorithm
    static int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
