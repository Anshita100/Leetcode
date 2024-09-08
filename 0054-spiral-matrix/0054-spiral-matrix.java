class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow=0,endrow=matrix.length-1,startcol=0,endcol=matrix[0].length-1;
        List<Integer> mylist=new ArrayList<Integer>();
        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for(int i=startcol;i<=endcol;i++)
            {
                mylist.add(matrix[startrow][i]);
            }
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                mylist.add(matrix[i][endcol]);
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--)
            {
                if(startrow==endrow) break;
                mylist.add(matrix[endrow][i]);
            }
            //left
            for(int i=endrow-1;i>startrow;i--)
            {
                if(startcol==endcol) break;
                mylist.add(matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        return mylist;
    }
}