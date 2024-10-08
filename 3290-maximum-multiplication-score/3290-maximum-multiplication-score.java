class Solution {
   public long maxScore(int[] a, int[] b) {
       long [][] dp = new long[5][b.length + 1];
       for (int i = 1; i <= 4; i++) {
           for (int j = i; j <= b.length; j++) {
               long pick = dp[i-1][j-1] + (long)a[i-1] * b[j-1];
               long unpick = dp[i][j-1];
               if (j - 1 < i) {
                   dp[i][j] = pick;
               } else {
                   dp[i][j] = Math.max(pick, unpick);
               }
           }
       }
       return dp[4][b.length];
   }
}