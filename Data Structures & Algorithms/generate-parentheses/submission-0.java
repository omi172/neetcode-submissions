class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a = new ArrayList<>();
        generate(0,0,n,a,"");
        return a;
    }
    static void generate(int i,int j,int n,List<String> a,String str){
        if(j == n){
            a.add(str);
            return;
        }
        if(i<n){
            generate(i+1,j,n,a,str+'(');
        }
        if(i>j){
            generate(i,j+1,n,a,str+')');
        }
    }
}
