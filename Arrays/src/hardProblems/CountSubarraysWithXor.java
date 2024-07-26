package hardProblems;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithXor {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int m = 6;
        System.out.println(countSubarraysWithXor(arr, m));
    }

    static int countSubarraysWithXor(int[] a, int b) {
        int xor = 0;
        int count = 0;

        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xor,1);

        for (int i = 0; i < a.length; i++){
            xor = xor ^ a[i];

            int preXor = xor ^ b;

            if (mpp.containsKey(preXor)){
                count = count + mpp.get(preXor);
            }


            if(mpp.containsKey(xor)){
                mpp.put(xor,mpp.get(xor)+1);
            }else{
                mpp.put(xor,1);
            }


        }
        return count;
    }
}
