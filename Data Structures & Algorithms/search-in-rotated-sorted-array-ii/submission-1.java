class Solution {
    public boolean search(int[] nums, int target) {
        return find(0, nums.length - 1, nums, target);
    }
    
    static boolean find(int start, int end, int[] nums, int target) {
     
        if (start > end) {
            return false;
        }
        
        int mid = start + (end - start) / 2;
         
        if (nums[mid] == target) {
            return true;
        }
         
        if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
            return find(start + 1, end - 1, nums, target);
        }
         
        if (nums[start] <= nums[mid]) { 
            if (target >= nums[start] && target < nums[mid]) {
                return find(start, mid - 1, nums, target);
            } else {
                return find(mid + 1, end, nums, target);
            }
        }  
        else { 
            if (target > nums[mid] && target <= nums[end]) {
                return find(mid + 1, end, nums, target);
            } else {
                return find(start, mid - 1, nums, target);
            }
        }
    }
}