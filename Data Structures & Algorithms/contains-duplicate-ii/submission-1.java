class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i])){
                int a = hmap.get(nums[i]);
                if(i - a <= k){
                    return true;
                }else{
                    hmap.put(nums[i],i);
                }
            }else{
                hmap.put(nums[i],i);
            }
        }
        return false;
    }
}