package LinkedLists;

import java.util.Arrays;
import java.util.List;

//https://www.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation
public class CountRotationsDup {
    public static void main(String[] args) {
        int[] nums  = {5,5,5,5,7,1,2,3,5,5,5};

        // Convert int array to Integer array
        Integer[] numsIntegerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        List<Integer> arr = Arrays.asList(numsIntegerArray);
        System.out.println(countRotations(arr));
    }

    static int countRotations(List<Integer> arr) {
        // Code here
        int start = 0;
        int end = arr.size() - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;


        while (start <= end){
            int mid  = start + (end - start) / 2;

            if (arr.get(start) == arr.get(mid) && arr.get(mid) == arr.get(end)){
                start = start + 1;
                end = end - 1;
                continue;
            }

            if (arr.get(start) < arr.get(end)){
                if (arr.get(start) < ans){
                    index = start;
                    ans = arr.get(start);
                }
                break;
            }

            if (arr.get(start) <= arr.get(mid)){ //left array is sorted
                if(arr.get(start) < ans){
                    index = start; // store the lowest index
                    ans = arr.get(start); // update answer
                }
                start = mid + 1; // eliminate the array
            }else{
                if(arr.get(mid) < ans){
                    index = mid;
                    ans = arr.get(mid);
                }
                end = mid - 1;
            }
        }
        return index;
    }

}
