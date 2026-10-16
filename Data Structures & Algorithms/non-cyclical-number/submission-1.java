class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hset = new HashSet<>();
        while(n != 1){
            int sum = 0;
            while(n > 0){
                sum += Math.pow(n % 10,2);
                n = n / 10;
            }
            if(hset.contains(sum)){
                return false;
            }else{
                hset.add(sum);
            }
            n = sum;
        }
        return true;
    }
}
