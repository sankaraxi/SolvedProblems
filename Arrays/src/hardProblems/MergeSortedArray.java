package hardProblems;
//model1: store merged intervals in a first array
//https://leetcode.com/problems/merge-sorted-array/
//model2: store merged intervals in first and second array
//https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//solution for model1 and refer gfg for model2
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(arr1, m, arr2, n);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

//    static void merge(int[] nums1, int m, int[] nums2, int n) {
//        List<Integer> temp = new ArrayList<>();
//
//        for (int i = 0; i < m;i++){
//            temp.add(nums1[i]);
//        }
//
//        for (int j = 0; j < n;j++){
//            temp.add(nums2[j]);
//        }
//        temp.sort(null);
//        for (int k = 0; k < temp.size(); k++){
//            nums1[k] = temp.get(k);
//        }
//    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n;i++){
            if(nums1[m+i]==0){
                nums1[m+i] = nums2[i];
            }
        }

        Arrays.sort(nums1);
    }
}
// another solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}