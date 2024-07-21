package easyProblems;

import java.util.*;
import java.util.stream.IntStream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
//        removeDuplicates(arr, n);
    }
//    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    //optimal solution
    static int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) { //start from the second element and compare it with the current element i
            if (arr[j] != arr[i]){  // if the element is not equal to the current element then add the element next to
                // the current element
                arr[i+1] = arr[j];
                i++; // then increment the current element's index
            }
        }
        return i+1; //return the current element's index + 1 after the process
    }
    //My Give a Try

//    static int removeDuplicates(int[] arr, int n) {
//
//        List<Integer> remArr = new ArrayList<>(IntStream.of(arr)
//                .boxed()
//                .toList());
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(remArr.get(i)==remArr.get(j)){
//                    remArr.remove(i);
//                    remArr.add(-1);
//                }
//            }
//
//        }
//
//
//        System.out.println(remArr);
//        int k = remArr.size();
//        return k;
//    }
}
