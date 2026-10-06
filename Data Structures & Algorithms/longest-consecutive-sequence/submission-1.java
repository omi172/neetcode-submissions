class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            hset.add(nums[i]);
        }
        int ans = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            int ele = nums[i];
            if(hset.contains(ele-1)){
                continue;
            }
            while(hset.contains(ele)){
                count++;
                ele++;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
