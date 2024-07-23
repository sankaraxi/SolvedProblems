package mediumProblems;
//https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays
public class PairWithMaxSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5};
        System.out.println(pairWithMaxSum(arr));
    }

    static int pairWithMaxSum(int[] arr) {
        // Your code goes here
        int result = 0;
        for (int i = 1; i < arr.length; i++){
            result = Math.max(result, arr[i]+arr[i-1]);
        }
        return result;
    }
}
