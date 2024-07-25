package hardProblems;
//https://leetcode.com/problems/majority-element-ii/description/
import java.util.ArrayList;
import java.util.List;


public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElementII(arr));
    }

    static List<Integer> majorityElementII(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;


        for (int num : arr) {
            if (count1 == 0  && candidate2 != num) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0 && candidate1 != num) {
                candidate2 = num;
                count2 = 1;
            } else if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        int minimum = arr.length / 3;
        List<Integer> result = new ArrayList<>();
        if (count1 > minimum) {
            result.add(candidate1);
        }
        if (count2 > minimum) {
            result.add(candidate2);
        }
        return result;
    }
}
