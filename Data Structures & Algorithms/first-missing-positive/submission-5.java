class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>hset = new HashSet<>();
        for(int i : nums){
            hset.add(i);
        }
        for(int i : nums){
            if(i > 1){
                return 1;
            }
            while(hset.contains(i)){
                i++;
                while(i <= 0){
                    i++;
                }
            }
            return i;
        }
        return -1;
    }
}