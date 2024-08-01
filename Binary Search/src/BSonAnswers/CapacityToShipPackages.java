package BSonAnswers;
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
import java.util.Arrays;

public class CapacityToShipPackages {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        System.out.println(shipWithinDays(weights,D));
    }
    //optimal solution
    static int shipWithinDays(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt();
        int end = sum(weights);

        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            int daysReq = findLeastCapacity(weights, mid);
            if (daysReq <= days){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start; // to return the least capacity
    } //Time complexity : O(n) * O(log(sum(weights) - max(weights) + 1))  = O(nlog(sum(weights) - max(weights) + 1))
    // Space complexity : O(1)

//    static int shipWithinDays(int[] weights, int days) {
//        int max = Arrays.stream(weights).max().getAsInt();
//        int sum = sum(weights);
//
//        for (int capacity = max; capacity <= sum; capacity++){
//            int daysReq = findLeastCapacity(weights, capacity);
//            if (daysReq <= days){
//                return capacity;
//            }
//        }
//        return -1;
//    } //Time complexity : O(n) * O(sum(weights) - max(weights) + 1)  = O(n(sum(weights) - max(weights) + 1))
    // Space complexity : O(1)

    static int findLeastCapacity(int[] weights, int capacity){
        int day = 1;
        int load = 0;

        for (int i = 0; i < weights.length; i++){
            if(load+weights[i] > capacity){
                day = day + 1;
                load = weights[i];
            }else{
                load = load + weights[i];
            }
        }

        return day;
    }

    static int sum(int[] weights){
        int sum = 0;
        for (int i = 0; i < weights.length;i++){
            sum = sum + weights[i];
        }
        return sum;
    }
}
