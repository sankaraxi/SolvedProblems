package mediumProblems;
//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array
import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10,4,2,4,1};

        System.out.println(leaders(arr));
    }

    // brute force solution

//    static ArrayList<Integer> leaders(int[] arr){
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < arr.length-1; i++) {
//            boolean leader = true;
//            for (int j = i+1; j < arr.length-1; j++) {
//                if(arr[i]<arr[j]){
//                    leader = false;
//                    break;
//                }
//            }
//            if (leader){
//                ans.add(arr[i]);
//            }
//        }
//        ans.add(arr[arr.length-1]);
//
//        return ans;
//    }//O(N^2) Time Complexity
    //O(N) Space complexity used to store and return the answer

    //optimal solution
    static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maximum = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >=0 ; i--) {
            if(arr[i] >= maximum){
                ans.add(arr[i]);
            }
            maximum = Math.max(maximum,arr[i]);
        }

        reverseArr(ans,0,ans.size()-1);
        return ans;
    }//O(N) Time Complexity
    static void reverseArr(ArrayList<Integer> arr, int start, int last) {
        while(start<=last){
            int temp = arr.get(start);
            arr.set(start,arr.get(last));
            arr.set(last,temp);
            start++;
            last--;
        }//O(N) Time Complexity
    }//Overall Time Complexity is O(2N) which is O(N)
    //Space Complexity is O(N) used to store and return the answer
}
