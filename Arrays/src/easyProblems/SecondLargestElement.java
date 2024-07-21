package easyProblems;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }

    // my brute force solution
//    static int secondLargest(int[] arr) {
//        for (int i = 0; i < arr.length -1; i++) {
//            for (int j = i+1; j > 0; j--) {
//                if(arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//        return arr[arr.length - 2];
//    }

    //better solution
//    static int secondLargest(int[] arr) {
//        int largest = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>largest){
//                largest = arr[i];
//            }
//        }
//
//        int secondLargest = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < largest && arr[i] > secondLargest){
//                secondLargest = arr[i];
//            }
//        }
//        return secondLargest;
//    }


    //optimal solution
    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
