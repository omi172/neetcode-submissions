class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[temperatures.length];
        for(int i = temperatures.length-1;i>=0;i--){
            if(i == temperatures.length){
                ans[i] = 0;
                s.push(i);
            }else{
                while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i] = 0;
                }else{
                    ans[i] = s.peek()-i;
                }
                s.push(i);
            }
        }
        return ans;
    }
}
