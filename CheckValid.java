package leetcode;


/**
 * 2133. Check if Every Row and Column Contains All Numbers
 */

public class CheckValid {

    public boolean checkValid(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            boolean row[] = new boolean[matrix.length+1];
            boolean col[] = new boolean[matrix.length+1];

            for (int j = 0; j < matrix[i].length; j++) {
                int rowValue = matrix[i][j];
                int columnValue = matrix[j][i];
                if(row[rowValue] == true || col[columnValue] == true) {
                    return false;
                }
                row[rowValue] = true;
                col[columnValue] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckValid checkValid = new CheckValid();

        boolean result = checkValid.checkValid(new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}});
        System.out.println(result);
    }
}
