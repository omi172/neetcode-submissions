class Solution {
    static int memo[][];
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int[text1.length()][text2.length()];
        return solve(text1,text2,text1.length()-1,text2.length()-1);
    }
    static int solve(String text1,String text2,int i,int j){
        if(i<0 || j<0){
            return 0;
        }
        if(memo[i][j] != 0){
            return memo[i][j];
        }
        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + solve(text1,text2,i-1,j-1);
        }
        return memo[i][j] = Math.max(solve(text1,text2,i-1,j),solve(text1,text2,i,j-1));
    }
}
