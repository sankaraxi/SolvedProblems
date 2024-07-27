package hardProblems;

import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }


    // better solution
    static int[] findTwoElement(int arr[], int n) {

        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        int rep = -1;
        int mis = -1;

        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 2) {
                rep = i;
            } else if (hash[i] == 0) {
                mis = i;
            }

            if (rep != -1 && mis != -1) { // if repeating and missing number found earlier we dont
                // have to iterate further so break the loop;
                break;
            }
        }
        return new int[]{rep, mis};
    } // Time Complexity: O(N) + O(N) = O(2N), where N is the number of elements in the array.
    // Space Complexity: O(N), where N is the number of elements in the array.
}

