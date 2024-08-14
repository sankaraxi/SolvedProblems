package LinkedLists;

public class MoveZerosToLast {
    public static void main(String[] args) {
        int[] arr = {2,1};
        moveZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Brute Force Solution

//    static void moveZeros(int[] arr) {
//
//        List<Integer> temp = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) { //O(N) where N is the number of elements in the array
//            if(arr[i]!=0){
//                temp.add(arr[i]);
//            }
//        }
//
//        for (int i = 0; i < temp.size(); i++) { //O(x) where x is the number of non-zero elements
//            arr[i] = temp.get(i);
//        }
//
//        for (int i = temp.size(); i < arr.length; i++) { //O(N-x) where N is the number of elements in the array and x
//            // is the number of non-zero elements
//            arr[i] = 0;
//        } //O(2N) Overall time Complexity`
//
//        //Worst Space Complexity is O(N) where N is the number of elements in the array
//        //0(x) where x is the number of non-zero elements is average space complexity
//    }

    //Optimal Solution
    static void moveZeros(int[] arr) {
        int j = -1;
        for (int i= 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j=i;
                break; //use to stop the loop once the first zero is found
            }
        }
        if (j == -1) return; //if no zero is found then return the array as it is
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i]!=0){
                swapElements(arr,i,j);
                j++;
            }
        }
    }

    static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
