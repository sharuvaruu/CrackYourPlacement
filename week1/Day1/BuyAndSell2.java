//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/1327669652/
public int maxProfit(int[] prices) {
    // Initialize the first day's price as the buying price
    int buy = prices[0];
    // Initialize profit to zero
    int profit = 0;

    // Loop through the prices starting from the second day
    for (int i = 1; i < prices.length; i++) {
        // If the price drops compared to the previous day
        if (prices[i - 1] > prices[i]) {
            // Calculate the profit by selling at the previous day's price
            // and add it to the total profit
            profit += prices[i - 1] - buy;
            // Update the buying price to the current day's price
            buy = prices[i];
        }
    }

    // After the loop, calculate the profit from selling on the last day
    /* After the loop, we must check the last 
    transaction if the last day's price is 
    higher than the last buying price. 
    This step captures 
    the profit from any upward trend that might have continued to the last day.*/
    profit += prices[prices.length - 1] - buy;

    // Return the total profit
    return profit;
}
