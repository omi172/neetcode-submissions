class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,target,ans,new ArrayList<>());
        return ans;
    }
    static void solve(int nums[],int i,int target,List<List<Integer>> ans,ArrayList<Integer> a){
        if(i == nums.length){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(a));
            return;
        }
        for(int j = i; j < nums.length; j++){
            if(nums[j] <= target){
                a.add(nums[j]);
                solve(nums,j,target - nums[j],ans,a);
                a.remove(a.size()-1);
            }
        }

    }
}
