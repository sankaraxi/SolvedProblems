package monotonicStack;
//https://leetcode.com/problems/maximal-rectangle/
import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(matrix));
    }
    public static int maximalRectangle(char[][] matrix) {
        int maxRect = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = 0;
        char[][] pSum =  new char[rows][cols]; //prefix Sum Matrix

        for (int col = 0; col < cols; col++){
            sum = 0;
            for (int row = 0; row < rows; row++){
                sum = sum + (matrix[row][col] - '0');

                if(matrix[row][col] == '0'){
                    sum = 0;
                }

                pSum[row][col] = (char)(sum + '0');
            }
        }

        for (int i = 0; i < pSum.length; i++){
            maxRect = Math.max(maxRect,largestRectangle(pSum[i]));
        }

        return maxRect;
    }


    public static int largestRectangle(char[] arr){

        Stack<Integer> st = new Stack<>();
        int maxRect = 0;
        int nse=0;
        int pse = 0;
        int currElement = 0;

        for (int i = 0; i < arr.length; i++){
            while (!st.isEmpty() && (arr[st.peek()]-'0') > (arr[i] - '0')){
                currElement = st.pop();
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();

                maxRect = Math.max(maxRect,(arr[currElement] - '0' )* (nse-pse-1));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            currElement = st.pop();
            nse = arr.length;
            pse = st.isEmpty() ? -1 : st.peek();

            maxRect = Math.max(maxRect,(arr[currElement] - '0' )* (nse-pse-1));
        }
        return maxRect;

    }
}
