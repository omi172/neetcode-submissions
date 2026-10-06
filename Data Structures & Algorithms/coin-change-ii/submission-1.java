class Solution {
    static int memo[][];
    public int change(int amount, int[] coins) {
        memo = new int[coins.length][amount+1];
        Arrays.sort(coins);
        return solve(amount,coins,0);
    }
    static int solve(int amount,int coins[],int i){
        if(i == coins.length){
            return 0;
        }
        if(amount == 0){
            return 1;
        }
        if(memo[i][amount]!=0){
            return memo[i][amount]; 
        }
        int ans = 0;
        for(int j = i;j < coins.length; j++){
            if(amount >= coins[j]){
                ans += solve(amount - coins[j],coins,j);
            }
        }
        return memo[i][amount] = ans;
    }
}
