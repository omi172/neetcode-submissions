class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            tmap.put(nums[i],tmap.getOrDefault(nums[i],0)+1);
        }
        Pair arr[] = new Pair[tmap.size()];
        int i = 0;
        for(Map.Entry it : tmap.entrySet()){
            int key = (int) it.getKey();
            int val = (int) it.getValue();
            Pair p = new Pair(key,val);
            arr[i++] = p;
        }
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return (int)b.getValue() - (int)a.getValue();
            }
        });
        int ans[] = new int[k];
        i = 0;
        while(k-->0){
            ans[i] = (int)arr[i].getKey();
            i++;
        }
        return ans;
    }
}
