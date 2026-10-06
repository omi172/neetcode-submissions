class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        if(s == " "){
            return 1;
        }
        HashMap<Character,Integer> hmap = new HashMap<>();
        int len = 0, ans = 0, left = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hmap.containsKey(ch)){
                left = Math.max(hmap.get(ch) + 1, left);
            }
            hmap.put(ch, i);
            ans = Math.max(i - left + 1 , ans);
        }
        return ans;
    }
}
