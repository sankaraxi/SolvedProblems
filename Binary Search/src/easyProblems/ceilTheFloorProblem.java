package easyProblems;
//https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
import java.util.Arrays;

public class ceilTheFloorProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        System.out.println(Arrays.toString(getFloorAndCeil(target,arr)));
    }

    static int[] getFloorAndCeil(int x, int[] arr) {

        // code here
        Arrays.sort(arr);

        if (x>arr[arr.length - 1]){
            return new int[] {arr[arr.length - 1],-1};
        }else if (x < arr[0]){
            return new int[] {-1, arr[0]};
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start+(end - start) / 2;

            if(x > arr[mid]){
                start = mid + 1;
            }else if(x < arr[mid]){
                end = mid -1;
            }else{
                return new int[] {arr[mid],arr[mid]};
            }
        }

        return new int[] {arr[end],arr[start]}; // it returns floor and ceil

    }
}
