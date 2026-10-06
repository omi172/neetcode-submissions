class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return solve(nums,target,0,0);
    }
    static int solve(int nums[],int target,int i,int sum){
        if(sum == target && i == nums.length){
            return 1;
        }
        if(i == nums.length){
            return 0;
        }
        return  solve(nums,target,i+1,sum-nums[i]) + solve(nums,target,i+1,nums[i] + sum); 
    }
}
