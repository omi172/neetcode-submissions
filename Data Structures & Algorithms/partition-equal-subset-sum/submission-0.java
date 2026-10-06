class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        if(sum % 2 != 0){
            return false;
        }
        return solve(nums,0,sum / 2);
    }
    static boolean solve(int nums[],int i,int sum){
        if(i == nums.length){
            return sum == 0;
        }
        if(sum < 0){
            return false;
        }
        return solve(nums,i+1,sum) || solve(nums,i+1,sum - nums[i]);
    }
}
