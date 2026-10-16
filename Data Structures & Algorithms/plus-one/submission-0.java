class Solution {
    public int[] plusOne(int[] digits) {
        int carry[] = {1};
        solve(digits,0,carry);
        if(carry[0] == 1){
            int ans[] = new int[digits.length + 1];
            ans[0] = 1;
            for(int i = 1; i < digits.length; i++){
                ans[i] = digits[i - 1];
            }
            return ans;
        }
        return digits;
    }
    static void solve(int digits[],int src,int carry[]){
        if(src == digits.length){
            return;
        }
        solve(digits,src + 1, carry);
        if(carry[0] != 0){
            digits[src] += carry[0];
            if(digits[src] == 10){
                carry[0] = 1;
                digits[src] = 0;
            }else{
                carry[0] = 0;
            }
        }else{
            carry[0] = 0;
        }
    }
}
