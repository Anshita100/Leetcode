/*class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int miniPrice=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int currentprice=prices[i];
            maxProfit=Math.max(maxProfit,currentprice-miniPrice);
            miniPrice=Math.min(miniPrice,currentprice);
        }
        return maxProfit;
    }
}*/
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {    int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
             }       
            else
            {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}