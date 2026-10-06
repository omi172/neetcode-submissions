class Solution {
    public boolean validPalindrome(String s) {
        return solve(0,s.length()-1,s,false);
    }
    static boolean solve(int i,int n,String s,boolean flag){
        if(i > n){
            return true;
        }
        if(s.charAt(i) != s.charAt(n) && flag  == false){
           return solve(i + 1,n,s,true) ||
            solve(i,n - 1,s,true);
        }else if(s.charAt(i) != s.charAt(n)){
            return false;
        }else{
            return solve(i + 1, n - 1,s,flag);
        }
        
    }
}