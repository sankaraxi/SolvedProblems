package mediumProblems;
//https://leetcode.com/problems/spiral-matrix/description/
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int left = 0;
        int right = cols - 1;
        int bottom = rows - 1;

        while (top <= bottom && left <= right){
            //adding top row and moving right
            for (int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //adding right column and moving down
            for (int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if (top<=bottom){
                //adding bottom row and moving left
                for (int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right){
                //adding left column and moving up
                for (int i = bottom;i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
