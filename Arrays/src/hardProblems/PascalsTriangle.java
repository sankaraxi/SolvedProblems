package hardProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 6;
        System.out.println(generate(numRows));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }

    static List<Integer> generateRow(int row){

        int rowElement = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(rowElement);
        for(int col = 1; col<row; col++){
            rowElement = rowElement * (row - col);
            rowElement = rowElement / col;
            ansRow.add(rowElement);
        }
        return ansRow;
    }
}
