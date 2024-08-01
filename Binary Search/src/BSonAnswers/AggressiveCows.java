package BSonAnswers;
//https://www.geeksforgeeks.org/problems/aggressive-cows
import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,5};
        int cows = 3;
        int n = 5;
        System.out.println(solve(n,cows,arr));
    }
    //optimal solution
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int start = 0;
        int end = stalls[n-1] - stalls[0];

        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(canWePlace(stalls,mid,k)){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return end;
    }

    public static boolean canWePlace(int[] stalls,int dist, int cows) {
        int countCows = 1;
        int lastCow = stalls[0];

        for (int i = 1; i < stalls.length; i++){
            if(stalls[i]-lastCow >= dist){
                countCows++;
                lastCow = stalls[i];
                if (countCows >= cows) return true;
            }

        }
        return false;
    }
}
