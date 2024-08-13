//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class BuyAndSell {
    public int maxProfit(int[] prices) {
        // Starting mein minimum price ko first element ke equal set kar rahe hain
        int min = prices[0]; 
        // Initial profit zero hai
        int profit = 0;

        // Loop day 1 se start ho kar last day tak chalega
        for(int i = 1; i < prices.length; i++) {
            // sell price jo current day par hai, usko fetch kar rahe hain
            int sell = prices[i]; // yeh ith day par stock bechne ka price hai
            // sell karne ke baad ka profit calculate kar rahe hain
            int cost = sell - min;
            // ab tak ka maximum profit store kar rahe hain
            profit = Math.max(profit, cost);
            // agar current price minimum se kam hai, to usko update kar rahe hain
            min = Math.min(min, prices[i]);
        }
        // Sabse zyada profit jo mila hai, usko return karenge
        return profit;
    }
}
