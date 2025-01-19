/*class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int startCol = 0, endCol = mat[0].length-1;
        
        while(startCol <= endCol){
            int maxRow = 0, midCol = (startCol + endCol)/2;
            
            for(int row=0; row<mat.length; row++){
             //    maxRow = mat[row][midCol] >= mat[maxRow][midCol]? row : maxRow;  
             if(mat[row][midCol] >= mat[maxRow][midCol])
             maxRow=row;
             else
             maxRow=maxRow;
            }
            
            boolean leftIsBig    =   midCol-1 >= startCol  &&  mat[maxRow][midCol-1] > mat[maxRow][midCol];
            boolean rightIsBig   =   midCol+1 <= endCol    &&  mat[maxRow][midCol+1] > mat[maxRow][midCol];
            
            if(!leftIsBig && !rightIsBig)   // we have found the peak element
                return new int[]{maxRow, midCol};
            
            else if(rightIsBig)  // if rightIsBig, then there is an element in 'right' that is bigger than all the elements in the 'midCol', 
                startCol = midCol+1; //so 'midCol' cannot have a 'peakPlane'
            
            else // leftIsBig
                endCol = midCol-1;
        }
        return null;
    }
}*/
class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, lo = 0, hi = m - 1, mid; 
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            int max_row = 0;
            for (int i = 0; i < n; ++i) {
                if (matrix[max_row][mid] < matrix[i][mid])
                    max_row = i;
            }
            if ((mid == 0 || matrix[max_row][mid] > matrix[max_row][mid - 1]) && 
                (mid == m - 1 || matrix[max_row][mid] > matrix[max_row][mid + 1]))
                return new int[] {max_row, mid};
            else if (mid > 0 && matrix[max_row][mid - 1] > matrix[max_row][mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return new int[] {-1, -1};
    }
}