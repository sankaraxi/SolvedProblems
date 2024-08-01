package BSonAnswers;
//https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }


    //my solution
//    static int findKthPositive(int[] arr, int k) {
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] <= k){
//                k++;
//            }else{
//                return k;
//            }
//        }
//        return -1;
//    }// Time complexity : O(n)
//    // Space complexity : O(1)

    //optimal solution
    static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) start = mid + 1;
            else end = mid - 1;
        }
        return start + k;
    }// Time complexity : O(log n)
    // Space complexity : O(1)
}
