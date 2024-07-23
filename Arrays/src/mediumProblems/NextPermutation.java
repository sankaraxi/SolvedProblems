package mediumProblems;
//https://leetcode.com/problems/next-permutation/description/
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,1,5};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

  static void nextPermutation(int[] arr) {
        int index = -1;
        for (int i = arr.length-2; i >= 0; i--) { // this loop is used to find the first element from the right which
            // is smaller than the next element
            if (arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
      if(index == -1){ // if the index is -1 then the array is in descending order
          reverseArr(arr,0,arr.length-1);
          return;
      }

      for (int i = arr.length-1; i >= index ; i--) { // this loop is used to find the first element from the right
          // which is greater than the element at index
          if(arr[i]>arr[index]){
              swapArr(arr,i,index);
              break;
          }
      }

      reverseArr(arr,index+1,arr.length-1);
    }


    // helper functions
    static void swapArr(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void reverseArr(int[] arr, int start, int last) {
        while(start<=last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
}


// Another solution using list in java
//public class tUf {
//    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
//        int n = A.size(); // size of the array.
//
//        // Step 1: Find the break point:
//        int ind = -1; // break point
//        for (int i = n - 2; i >= 0; i--) {
//            if (A.get(i) < A.get(i + 1)) {
//                // index i is the break point
//                ind = i;
//                break;
//            }
//        }
//
//        // If break point does not exist:
//        if (ind == -1) {
//            // reverse the whole array:
//            Collections.reverse(A);
//            return A;
//        }
//
//        // Step 2: Find the next greater element
//        //         and swap it with arr[ind]:
//
//        for (int i = n - 1; i > ind; i--) {
//            if (A.get(i) > A.get(ind)) {
//                int tmp = A.get(i);
//                A.set(i, A.get(ind));
//                A.set(ind, tmp);
//                break;
//            }
//        }
//
//        // Step 3: reverse the right half:
//        List<Integer> sublist = A.subList(ind + 1, n);
//        Collections.reverse(sublist);
//
//        return A;
//    }
//
//    public static void main(String args[]) {
//        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
//        List<Integer> ans = nextGreaterPermutation(A);
//
//        System.out.print("The next permutation is: [");
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.print(ans.get(i) + " ");
//        }
//        System.out.println("]");
//
//    }
//
//}
