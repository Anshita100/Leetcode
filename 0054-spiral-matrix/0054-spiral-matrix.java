import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        List<Integer> response = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                response.add(matrix[startRow][j]);
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                response.add(matrix[i][endCol]);
            }

            // bottom
            if (startRow < endRow) { // Check to prevent duplicate row processing
                for (int j = endCol - 1; j >= startCol; j--) {
                    response.add(matrix[endRow][j]);
                }
            }

            // left
            if (startCol < endCol) { // Check to prevent duplicate column processing
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    response.add(matrix[i][startCol]);
                }
            }

            // Move boundaries inward
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return response;
    }
}
