class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 
        int[][] dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(prices, 0, 0, dp);
    }

    private int helper(int[] prices, int i, int buy, int[][] dp) {
        if (i >= prices.length) {
            return 0;
        }
        if (dp[i][buy] != -1) {
            return dp[i][buy];
        }

        int profit;
        if (buy == 0) { 
            int buyStock = -prices[i] + helper(prices, i + 1, 1, dp);
            int skipBuy = helper(prices, i + 1, 0, dp);
            profit = Math.max(buyStock, skipBuy);
        } else { 
            int sellStock = prices[i]; 
            int skipSell = helper(prices, i + 1, 1, dp);
            profit = Math.max(sellStock, skipSell);
        }

        return dp[i][buy] = profit;
    }
}