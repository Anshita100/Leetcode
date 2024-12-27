class Solution {
    public void setZeroes(int[][] matrix) {
        int r[]=new int[matrix.length];
        int c[]=new int[matrix[0].length];
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[0].length;col++)
            {
                if(matrix[row][col]==0)
                {
                   r[row]=1;
                   c[col]=1;
                }
            }
        }
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[0].length;col++)
            {
                if(r[row]==1 || c[col]==1)
                {
                  matrix[row][col]=0;
                }
            }
        }
        
    }
  
}