class Solution {
    public int minDistance(String word1, String word2) {
        return solve(word1,word2,word1.length()-1,word2.length()-1)+1;
    }
    static int solve(String word1,String word2,int n,int m){
        if(m<0){
            return n;
        }
        if(n<0){
            return m;
        }
        if(word1.charAt(n) == word2.charAt(m)){
            return solve(word1,word2,n-1,m-1);       
        }
        return 1 + Math.min(solve(word1,word2,n-1,m),Math.min(solve(word1,word2,n,m-1),solve(word1,word2,n-1,m-1)));
    }
}
