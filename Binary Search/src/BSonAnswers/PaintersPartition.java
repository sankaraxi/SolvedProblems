package BSonAnswers;

import java.util.ArrayList;
import java.util.Collections;

public class PaintersPartition {
    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>();

        boards.add(2);
        boards.add(1);
        boards.add(5);
        boards.add(6);
        boards.add(2);
        boards.add(3);

        int k = 2;
        System.out.println(findLargestMinDistance(boards, k));
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int start = Collections.max(boards);
        int end = sum(boards);

        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            int countArray = countArray(boards,mid);

            if(countArray <= k){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int countArray(ArrayList<Integer> boards, int sum){
        int arrays = 1;
        int arraySum = 0;

        for (int i = 0; i < boards.size(); i++){
            if(arraySum+boards.get(i)<=sum){
                arraySum+=boards.get(i);
            }else{
                arrays++;
                arraySum = boards.get(i);
            }
        }
        return arrays;
    }

    public static int sum(ArrayList<Integer> boards){
        int sum = 0;

        for (int i = 0; i < boards.size(); i++){
            sum = sum + boards.get(i);
        }

        return sum;
    }
}
