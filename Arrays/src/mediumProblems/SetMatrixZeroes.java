package mediumProblems;

import java.util.Arrays;

public class SetMatrixZeroes{
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1,1,1},
//                {1,0,1},
//                {1,1,1}
//        };

        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    //brute force solution
//    static void setZeroes(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) { //O(n)
//            for (int j = 0; j < matrix.length; j++) { //O(m)
//                if(matrix[i][j] == 0){
//                    markRow(matrix,i); // this marks all th row elements as -1  | 0(n)
//                    markCol(matrix,j); // this marks all the column elements as -1 | 0(m)
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) { // this loop replaces all -1 with 0 | 0(n)
//            for (int j = 0; j < matrix.length; j++) { // 0(m)
//                if(matrix[i][j] == -1){
//                    matrix[i][j] = 0;
//                }
//
//            }
//        }//Overall Time Complexity: O(n*m)*(n+m)+O(n*m)
//        //Space Complexity: O(1), No extra space is used.
//    }
//
//    static void markRow(int[][] matrix, int i) {
//        for (int j = 0; j < matrix.length; j++) {
//            if(matrix[i][j] != 0){
//                matrix[i][j] = -1;
//            }
//        }
//    }
//
//    private static void markCol(int[][] matrix, int j) {
//        for (int i = 0; i < matrix.length; i++) {
//            if (matrix[i][j] != 0) {
//                matrix[i][j] = -1;
//            }
//        }
//    }

    //better solution
//    static void setZeroes(int[][] matrix) {
//            int n = matrix.length; // number of rows
//            int m = matrix[0].length; // number of columns
//
//        int[] row = new int[n]; // row array initialized with 0
//        int[] col = new int[m]; // col array initialized with 0 by default
//
//        // Traverse the matrix:
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == 0) {
//                    // mark ith index of row wih 1:
//                    row[i] = 1;
//                    // mark jth index of col wih 1:
//                    col[j] = 1;
//                }
//            }
//        }//Time Complexity: O(N*M), N = number of rows, M = number of columns.
//        // Finally, mark all (i, j) as 0
//        // if row[i] or col[j] is marked with 1.
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (row[i] == 1 || col[j] == 1) {
//                    matrix[i][j] = 0;
//                }
//            }//Time Complexity: O(N*M), N = number of rows, M = number of columns.
//        }
//    }//Overall Time Complexity: O(2*N*M), N = number of rows, M = number of columns.
    //Space Complexity: O(N+M), where N = number of rows, M = number of columns.


// optimal solution
    static void setZeroes(int[][] matrix){
        int col0 = 1;

        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < matrix.length; i++){ //O(N)
            for(int j = 0; j < matrix[0].length; j++){ //O(M)
                if(matrix[i][j] == 0){
                    // mark i-th row:
                    matrix[i][0] = 0;
                    // mark j-th col:
                    if(j!=0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }//O(N*M)

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < matrix.length; i++){ //O(N)
            for (int j = 1; j < matrix[0].length; j++){ //O(M)
                if (matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j]==0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }//O(N*M)

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix[0][0] == 0){
            for(int j = 0 ; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0){
            for(int i = 0 ; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }//Overall Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    //Space Complexity: O(1), No extra space is used.
}
