package mediumProblems;
//https://leetcode.com/problems/rotate-image/description/
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateArr(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

     static void rotateArr(int[][] matrix) {

        //step1: transposing the array
         for (int i = 0; i < matrix.length - 1; i++) {
             for (int j = i+1; j < matrix.length; j++) {
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i]=temp;
             }
         }

         //step 2 reverse each row of the transposed arr
         for (int i = 0; i < matrix.length; i++) {
             reverseArr(matrix[i],0,matrix[i].length-1);
         }
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
