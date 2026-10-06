class Solution {
    public int trap(int[] height) {
        int pre[] = new int[height.length];
        int post[] = new int[height.length];
        pre[0] = height[0];
        for(int i = 1; i < height.length; i++){
            pre[i] = Math.max(height[i],pre[i - 1]); 
        }
        post[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            post[i] = Math.max(height[i],post[i + 1]); 
        }
        int water = 0;
        for(int i = 0; i < height.length; i++){
            water += Math.min(post[i],pre[i]) - height[i];
        }
        return water;
    }
}
