class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(0,0,n,"",ans);
        return ans;
    }
    static void solve(int l,int r,int n,String str,List<String> ans){
        if(r == n){
            ans.add(str);
            return;
        }
        
        if(l < n){
            solve(l+1,r,n,str+"(",ans);
        }
        if(r < l){
            solve(l,r+1,n,str+")",ans);
        }
    }
}
