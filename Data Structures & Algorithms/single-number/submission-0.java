class Solution {
    public int singleNumber(int[] nums) { 
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            if(hset.contains(nums[i])){
                hset.remove(nums[i]);
            }else{
                hset.add(nums[i]);
            }
        }
        Integer str = hset.stream().findFirst().orElse(null);
        return (int)(str);
    }
}
