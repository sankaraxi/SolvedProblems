package mediumProblems;
//https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1
import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] tree = {3, 1, 2, 2, 2, 2};
        System.out.println(totalFruits(tree));
    }

    public static int totalFruits(int[] arr) {
        // code here

        int maxLen = 0;
        int left = 0;
        int right = 0;

        Map<Integer, Integer> mpp = new HashMap<>();


        while (right < arr.length){
            mpp.put(arr[right], mpp.getOrDefault(arr[right],0)+1);

            if(mpp.size() > 2){

                // while (mpp.size() > 2){ //

                mpp.put(arr[left], mpp.getOrDefault(arr[left],0)-1);
                if(mpp.get(arr[left]) == 0) mpp.remove(arr[left]);
                left++;

                // }

            }

            if(mpp.size() <= 2){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }

        return maxLen;
        // Time Complexity: O(n)
        // Space Complexity: O(n)



        // int maxLen = 0;

        // for (int i = 0; i < arr.length; i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j = i; j < arr.length; j++){
        //         set.add(arr[j]);
        //         if (set.size() <= 2){
        //             maxLen = Math.max(maxLen,j-i+1);
        //         }else {
        //             break;
        //         }
        //     }
        // }
        // return maxLen;
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
    }
}
