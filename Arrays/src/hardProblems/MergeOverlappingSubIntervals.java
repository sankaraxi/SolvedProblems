package hardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }

//    static int[][] merge(int[][] intervals) {
//        int n = intervals.length; // size of the array
//        //sort the given intervals:
//        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); // sort the intervals based on the start time
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) { // select an interval:
//            int start = intervals[i][0];
//            int end = intervals[i][1];
//
//            //Skip all the merged intervals:
//            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
//                continue;
//            }
//
//            //check the rest of the intervals:
//            for (int j = i + 1; j < n; j++) {
//                if (intervals[j][0] <= end) {
//                    end = Math.max(end, intervals[j][1]);
//                } else {
//                    break;
//                }
//            }
//            ans.add(Arrays.asList(start, end));
//        }
//        int[][] result = new int[ans.size()][2];
//        for (int i = 0; i < ans.size(); i++) {
//            result[i][0] = ans.get(i).get(0);
//            result[i][1] = ans.get(i).get(1);
//        }
//        return result;
//    }// Time Complexity: O(NlogN) * O(2N), N = size of the given array.
//    // Space Complexity: O(N), where N is the number of elements in the array.

    static int[][] merge(int[][] intervals) {

        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
        }

        int[][] result = new int[ans.size()][2];
        for(int i = 0; i < ans.size(); i++){
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        return result;
    } // Time Complexity: O(NlogN) + O(N), N = size of the given array.
    // Space Complexity: O(N), where N is the number of elements in the array.
}
