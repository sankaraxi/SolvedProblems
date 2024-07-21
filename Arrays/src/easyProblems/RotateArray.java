package easyProblems;
//https://leetcode.com/problems/rotate-array/description/
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int rotations = 3;
//        rotateArray(arr);
        rotateArray(arr,rotations);
        System.out.println(Arrays.toString(arr));


    }
    // rotate Array for one time (anti-clock-wise)
//    static void rotateArray(int[] arr){
//        int temp = arr [0]; //store the stating value in an temporary variable
//        for (int i = 1; i < arr.length; i++) { // then shift the position of adjacent elements by 1 index left
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length-1] = temp;
//    }

    // rotate Array for one time (clock-wise)
    static void rotateArray(int[] arr){
        int temp = arr [arr.length-1]; //store the stating value in an temporary variable
        for (int i = arr.length-2;i >=0; i--) { // then shift the position of adjacent elements by 1 index left
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
    //brute-force
    // rotate Array for d times (anti-clock-wise)
//    static void rotateArray(int[] arr, int rotations){
//        int[] temp = Arrays.copyOfRange(arr,0,rotations);
//
//        for (int i = rotations; i < arr.length ; i++) {
//            arr[i-rotations] = arr[i];
//        }
//
//        for (int i = arr.length - rotations; i < arr.length ; i++) {
//            arr[i] = temp[i-(arr.length - rotations)]; //4 - 4 =0; 5 - 4 = 1; 6 - 4 = 2 // for accessing the temporary array
//        }
//    }
    //optimal solution
    // rotate Array for d times (anti-clock-wise)
    static void rotateArray(int[] arr, int rotations){
        rotations = rotations % arr.length;
        reverseArr(arr,0,rotations -1); //[3,2,1,4,5,6,7]
        reverseArr(arr,rotations,arr.length-1); //[3,2,1,7,6,5,4]
        reverseArr(arr,0,arr.length-1); //[4,5,6,7,1,2,3] anti-clockwise rotation
    }

    //optimal solution
    // rotate Array for d times (clock-wise)
//    static void rotateArray(int[] arr, int rotations){
//        rotations = rotations % arr.length;
//        reverseArr(arr,0,arr.length-1); //[7,6,5,4,3,2,1]
//        reverseArr(arr,0,rotations -1); //[5,6,7,4,3,2,1]
//        reverseArr(arr,rotations,arr.length-1); //[5,6,7,1,2,3,4] clockwise rotation
//
//    }
    static void reverseArr(int[] arr, int start, int last) {
        while(start<=last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        } // [5, 6, 7, 1, 2, 3, 4] //clockwise
    }

    //My Solution - but didn't work :)
//    static void rotateArray(int[] arr, int rotations){
//        int initial = 0;
//        while(rotations > 0){
//            int temp = arr[arr.length-rotations];
//            arr[arr.length-rotations] = arr[initial];
//            arr[initial] = temp;
//            initial++;
//            rotations--;
//        }
//    }
}
