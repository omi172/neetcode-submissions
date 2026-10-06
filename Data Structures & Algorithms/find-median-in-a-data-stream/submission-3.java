class MedianFinder {
    ArrayList<Integer> ans;
    public MedianFinder() {
        ans = new ArrayList<>();
    }
    
    public void addNum(int num) {
        ans.add(num);
    }
    
    public double findMedian() {
        if(ans == null){
            return 0;
        }
        Collections.sort(ans);
        if(ans.size() % 2 == 0){
            return ((ans.get(ans.size() / 2 - 1) + ans.get(ans.size() / 2)) / 2.0);
        }else{
            return (ans.get(ans.size() / 2));
        }
    }
}
