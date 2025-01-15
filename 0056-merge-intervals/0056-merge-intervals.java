class Solution {
  /* public int[][] merge(int[][] intervals) {         
    int n = intervals.length;

    
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    
    int[][] matrix = new int[n][2]; 
    int k = 0; 

    for (int i = 0; i < n; i++) {
        // Step 3: If the result list is not empty and overlaps with the current interval
        if (k > 0 && matrix[k - 1][1] >= intervals[i][0]) {
            // Merge intervals
            matrix[k - 1][1] = Math.max(matrix[k - 1][1], intervals[i][1]);
        } else {
            // Add new interval to the result
            matrix[k][0] = intervals[i][0];
            matrix[k][1] = intervals[i][1];
            k++;
        }
    }

     //return Arrays.copyOf(matrix, k);
    // Step 4: Create a new array of size k and copy merged intervals
    int[][] result = new int[k][2];
    for (int i = 0; i < k; i++) {
        result[i][0] = matrix[i][0];
        result[i][1] = matrix[i][1];
    }

    return result;
}*/
public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ArrayList<int[]> temp=new ArrayList<>();
        for(int[] interval:intervals)
        {
            if(temp.isEmpty() || temp.getLast()[1]<interval[0])
            {
                temp.add(interval);
            }
            else
            {
                temp.getLast()[1]=Math.max(temp.getLast()[1], interval[1]);
            }
        }
        int[][] res=new int[temp.size()][2];
        for(int i=0;i<temp.size();i++)
        {
            int[] t=temp.get(i);
            for(int j=0;j<2;j++)
            {
                res[i][j]=t[j];
            }
        }
        return res;
    }
   
/*public int[][] merge(int[][] intervals) {
   
    
    // Step 1: Sort intervals by their start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    // Step 2: Use a list to store merged intervals
    List<int[]> merged = new ArrayList<>();

    // Step 3: Iterate through the intervals and merge
    for (int[] interval : intervals) {
        // If merged list is empty or current interval doesn't overlap with the last interval
        if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
            merged.add(interval);
        } else {
            // Overlapping intervals: update the end time of the last interval
            merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
        }
    }

    // Convert the list to a 2D array and return
    return merged.toArray(new int[merged.size()][]);
}*/

}