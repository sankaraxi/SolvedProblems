package LinkedLists;
//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
import java.util.*;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 2, 3, 4};
        System.out.println(unionOfArrays(arr1, arr2));
    }

    //brute force
//   static int[] unionOfArrays(int[] arr1, int[] arr2) {
//       Set<Integer> union = new HashSet<>();
//        for (int i = 0; i < arr1.length; i++) {
//           union.add(arr1[i]);  //O(N1 log N1) where N1 is the number of elements in the first array
//       }
//       for (int i = 0; i < arr2.length; i++) {
//           union.add(arr2[i]); //O(N2 log N2) where N2 is the number of elements in the second array
//       }
//       int [] unionArr= new int[union.size()];
//       for (int i = 0; i < union.size(); i++) {
//           unionArr[i] = (int) union.toArray()[i]; // to access elements from the set
//       } //O(N1 + N2)
//
//
//       // Time Complexity: O(N1 log N1 + N2 log N2 + N1 + N2) where N1 is the number of elements in the first array and
//       // N2 is the number of elements in the second array
//
//       //Space Complexity: O(N1 + N2) + O(N1 + N2)
//       return unionArr;
//    }
    //Optimal Solution

    static ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
    //O(N1 + N2) where N1 is the number of elements in the first array and
    // N2 is the number of elements in the second array

    //Space Complexity: O(N1 + N2) used to return the result

}