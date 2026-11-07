class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int maxWeight = 0;
       for (int w : weights) {
            sum += w;
            maxWeight = Math.max(maxWeight, w);
        }
        
        int low = maxWeight, high = sum, ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(mid, days, weights)) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }

    static boolean check(int mid, int d, int[] weights) {
        int daysNeeded = 1;
        int currentWeight = 0;
        
        for (int w : weights) { 
            if (w > mid) {
                return false;
            }
             
            if (currentWeight + w > mid) {
                daysNeeded++;
                currentWeight = w;
            } else {
                currentWeight += w;
            }
        }
        
        return daysNeeded <= d;
    }
}