class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        ans[0] = pq.peek();
        for(int i=k;i<nums.length;i++){
            ans[i-k] = pq.peek();
            pq.remove(nums[i-k]);
            pq.add(nums[i]);
        }
        ans[ans.length-1] = pq.peek();
        return ans;
    }
}
