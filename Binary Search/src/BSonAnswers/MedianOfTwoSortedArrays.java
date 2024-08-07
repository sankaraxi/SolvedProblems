package BSonAnswers;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
//        int[] nums1 = {1,3,4,7,10,12};
//        int[] nums2 = {2,3,6,15};
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
//        findMedianSortedArrays(nums1, nums2);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1 + n2;

        int[] nums3 = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            } else if (nums2[j] < nums1[i]) {
                nums3[k] = nums2[j];
                j++;
                k++;
            }else{
                nums3[k]=nums1[i]; // or nums3[k] = nums2[j]
                i++; //j++
                k++;
            }
        }

        while (i < n1) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        int half = n / 2;
        double ans = 0;
        if (n % 2 == 0){
            ans = ((double)nums3[half] + (double)nums3[half - 1]) / (double) 2;
        }else{
            ans = (double)nums3[half];
        }
        return ans;
    }// 
}
