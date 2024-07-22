package easyProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays{
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1,5};
        int[] arr2 = {2,2,5};
        System.out.println(intersection(arr1,arr2));
//        intersection(arr1,arr2);
    }

    // brute-force
//    static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//
//        ArrayList<Integer> visited = new ArrayList<>(n2);
//        for (int i = 0; i < n2; i++) {
//            visited.add(0);
//        }
//        System.out.println(visited);
//        ArrayList<Integer> intersection = new ArrayList<>();
//
//        for (int i = 0; i < arr1.length; i++){
//            for (int j = 0; j < arr2.length; j++){
//                if(arr1[i]==arr2[j] && visited.get(j)==0){
//                    intersection.add(arr1[i]);
//                    visited.set(j,1);
//                    break;
//                }
//                if (arr2[j] > arr1[i]){
//                    break;
//                }
//            }
//        }
//        return intersection;

        //O(N1 * N2) where N1 is the number of elements in the first array and
        // N2 is the number of elements in the second array

        //Space Complexity: O(N2) where N2 is the number of elements in the second array
        // because of the visited array is created with the size of the second array
//    }


    //Optimal Solution
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        //Two Pointers
        int i = 0;
        int j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i]){
                i++;
            }else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }

    //Time Complexity: O(N1 + N2)
    //Space Complexity: O(1)
}
