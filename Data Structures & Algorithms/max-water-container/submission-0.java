class Solution {
    public int maxArea(int[] heights) {
        int l = 0,r = heights.length-1;
        int water = 0;
        int ans = 0;
        while(l<r){
            if(heights[l] <= heights[r]){
                water = (r - l) * heights[l];
                l++;
            }else{
                water = (r - l) * heights[r];
                r--;
            }
            ans = Math.max(ans,water);
        }
        return ans;
    }
}
