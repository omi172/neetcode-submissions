class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> s1Count = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            s1Count.put(s1.charAt(i),s1Count.getOrDefault(s1.charAt(i),0)+1);
        }
        int need =  s1Count.size();
        for(int i = 0;i<s2.length();i++){
            Map<Character,Integer> count = new HashMap<>();
            int curr = 0;
            for(int j = i;j < s2.length(); j++){
                char c = s2.charAt(j);
                count.put(c,count.getOrDefault(c,0)+1);
                if(s1Count.getOrDefault(c,0) < count.get(c)){
                    break;
                }
                if(s1Count.getOrDefault(c,0) == count.get(c)){
                    curr++;
                }
                if(curr == need){
                    return true;
                }
            }
        }
        return false;
    }
}
