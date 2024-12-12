/*class Solution {
    public int maxProfit(int[] a) {
        int maxProfit=0;
        int miniPrice=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            maxProfit=Math.max(maxProfit,a[i]-miniPrice);
            miniPrice=Math.min(miniPrice,a[i]);
        }
        return maxProfit;
    }
}*/
/*class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {   
                maxProfit=Math.max(maxProfit,prices[i]-buyPrice);
             }       
            else
            {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}*/
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}