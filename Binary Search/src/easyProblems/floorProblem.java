package easyProblems;
//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
public class floorProblem {
    public static void main(String[] args) {
        long[] arr = {1, 2, 8, 10, 10, 12, 19};
        long target = 5;
        System.out.println(findFloor(arr,arr.length,target));
    }

    static int findFloor(long arr[], int n, long x) {

        if (x < arr[0]){
            return -1;
        }

        int start = 0;
        int end = n - 1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if(x > arr[mid]){
                start = mid + 1;
            }else if(x < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return end;
    }
}
