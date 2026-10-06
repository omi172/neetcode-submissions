class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0, r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(l <= r){
            int k = (l + r)/2;
            long tTime = 0;
            for(int p : piles){
                tTime += Math.ceil((double) p / k);
            }
            if(tTime <= h){
                res = k;
                r = k - 1;
            }else{
                l = k + 1;
            }
        }
        return res;
    }
}
