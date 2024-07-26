package hardProblems;
//https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category%5B%5D=Hash&company%5B%5D=Amazon&page=1&query=category%5B%5DHashcompany%5B%5DAmazonpage1company%5B%5DAmazoncategory%5B%5DHash&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-subarray-with-0-sum
import java.util.HashMap;

public class LongestSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr));
    }

    static int maxLen(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++){
            sum = sum + arr[i];
            if (sum == 0){
                maxLen = i + 1;
            }else{
                if (mpp.containsKey(sum)){
                    int len = i - mpp.get(sum);
                    maxLen = Math.max(maxLen, len);
                }else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxLen;
    }
}
