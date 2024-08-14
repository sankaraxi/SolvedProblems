package LinkedLists;
//https://leetcode.com/problems/single-number/description/

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

    //brute force solution
//    static int singleNumber(int[] arr) {
//        int n = arr.length;
//
//        //Run a loop for selecting elements:
//        for (int i = 0; i < n; i++) {
//            int num = arr[i]; // selected element
//            int count = 0;
//
//            //find the occurrence using linear search:
//            for (int j = 0; j < n; j++) {
//                if (arr[j] == num)
//                    count++;
//            }
//
//            // if the occurrence is 1 return ans:
//            if (count == 1) return num;
//        }
//        //This line will never execute
//        //if the array contains a single element.
//        return -1;
//    }// Time Complexity: O(N^2) where N is the number of elements in the array
//    //Space Complexity: O(1)

//better solution using hashmap
//    static int singleNumber(int[] arr) {
//        Map<Integer,Integer> mpp = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int value = mpp.getOrDefault(arr[i], 0);
//            mpp.put(arr[i], value + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//            if (it.getValue() == 1) {
//                return it.getKey();
//            }
//        }
//        return -1;
//    }// O(2N) where N is the number of elements in the array
//    //Space Complexity: O(N) because of the hashmap
    // Optimal Solution using XOR
    static int singleNumber(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }// Time Complexity: O(N) where N is the number of elements in the array
    //Space Complexity: O(1)
}
