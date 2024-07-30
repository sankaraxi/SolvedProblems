package BSonAnswers;
//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
import java.util.Arrays;

public class MinimumNumberofDaystoMakemBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay,m,k));
    }
    static int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        if (val > bloomDay.length) return -1;
        int start = Arrays.stream(bloomDay).min().getAsInt();
        int end = Arrays.stream(bloomDay).max().getAsInt();

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(possible(bloomDay,mid,m,k)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return ans;
    }

    static boolean possible(int[] arr , int days, int m, int k){
        int boquets = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] <= days){
                count = count + 1;
            }else{
                boquets = boquets + (count/k);
                count = 0;
            }
        }
        boquets = boquets + (count/k);

        if (boquets >= m){
            return true;
        }else{
            return false;
        }
    }
}
