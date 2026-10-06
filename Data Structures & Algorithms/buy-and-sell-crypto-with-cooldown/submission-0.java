class Solution {
    public int maxProfit(int[] prices) {
        return solve(prices,0,0,1);
    }
    static int solve(int prices[],int i,int bOS,int k){
        if(i>=prices.length || k == 0){
            return 0;
        }
        int x = 0;
        if(bOS == 0){
            int buy = solve(prices,i+1,1,k) - prices[i];
            int notBuy = solve(prices,i+1,0,k);
            x += Math.max(buy,notBuy);
        }else{
            int sell =  solve(prices,i+2,0,k) + prices[i];
            int notSell = solve(prices,i+1,1,k);
            x += Math.max(sell,notSell);
        }
        return x;
    }
}
