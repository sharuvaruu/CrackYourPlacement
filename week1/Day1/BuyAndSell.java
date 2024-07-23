//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class BuyAndSell {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int sell=prices[i];//it is the selling price of stock on ith day
            int cost=sell-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}