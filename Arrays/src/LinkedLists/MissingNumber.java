package LinkedLists;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(arr));
    }

//// brute force solution
//    static int missingNumber(int[] arr) {
//        for (int i = 0; i <= arr.length; i++) {
//            int flag = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j]==i) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0){
//                return i;
//            }
//        }
//        return -1;
//    }// O(N^2) where N is the number of elements in the array
//    //Space Complexity: O(1)


//    static int missingNumber(int[] arr) {
//        int hash[] = new int[arr.length + 1]; //hash array
//
//        // storing the frequencies:
//        for (int i = 0; i < arr.length; i++)
//            hash[arr[i]] = hash[arr[i]] + 1;
//
//        //checking the freqencies for numbers 1 to N:
//        for (int i = 1; i <= arr.length; i++) {
//            if (hash[i] == 0) {
//                return i;
//            }
//        }
//
//        // The following line will never execute.
//        // It is just to avoid warnings.
//        return -1;
//
//    }//Time Complexity: O(2N), where N is the number of elements in the array.
//      Space Complexity: O(N) extra space is used to store the frequencies of the elements.

    //optimal using sum of first n natural numbers
//    static int missingNumber(int[] arr) {
//        int n = arr.length;
//        int sum = n * (n + 1) / 2; //sum of first n natural numbers
//        int sum2 = 0;
//        for (int i = 0; i < n; i++) {
//            sum2 = sum2 + arr[i];
//        }
//        return sum - sum2;
//    }//Time Complexity: O(N), where N is the number of elements in the array.
//    //Space Complexity: O(1), No extra space is used.


    // optimal using XOR
    static int missingNumber(int[] arr) {
        int n = arr.length;
        int xor1 = 0; // 0 ^ 1 = 1 so initializing with 0 also 0 ^ 0 = 0 , 1 ^ 1 = 0
        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i]; //XOR of all the elements in the array
            xor1 = xor1 ^ (i); //XOR of all the elements from 0 to n
        }
        xor1 = xor1 ^ n ;
        return xor1 ^ xor2;
    }//Time Complexity: O(N), where N is the number of elements in the array.
    //Space Complexity: O(1), No extra space is used.
}


