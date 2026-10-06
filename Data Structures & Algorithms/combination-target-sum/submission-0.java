class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums.length - 1,ans,nums,target,new ArrayList<>());
        return ans;
    }
    static void solve(int i,List<List<Integer>> ans,int nums[],int target,ArrayList<Integer> a){
        if(i < 0 || target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(a));
            return;
        }
        for(int j = i; j >= 0; j--){
            if(nums[j] <= target){
                a.add(nums[j]);
                solve(j, ans,nums, target - nums[j], a);
                a.remove(a.size()-1);
            }
        }
    }
}
