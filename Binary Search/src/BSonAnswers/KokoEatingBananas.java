package BSonAnswers;
//https://leetcode.com/problems/koko-eating-bananas/
import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = Arrays.stream(piles).max().getAsInt();

        int ans = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end - start) / 2;

            double totalHrs = totalHrs(piles,mid);
            if (totalHrs <= h){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return ans;
    }

    static double totalHrs(int[] arr, int hours){
        double totalHrs = 0;
        for (int i = 0; i < arr.length; i++){
            totalHrs = totalHrs + Math.ceil((double)(arr[i]) / (double)(hours));
        }
        return totalHrs;
    }
}
