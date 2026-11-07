class TimeMap {
    static HashMap<String,TreeMap<Integer, String>> store;
    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new TreeMap<>());
        store.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
      if (!store.containsKey(key)) {
            return "";
        }
        
       TreeMap<Integer, String> treeMap = store.get(key);
       Integer floorTimestamp = treeMap.floorKey(timestamp);
        
        if (floorTimestamp == null) {
            return ""; 
        }
        
        return treeMap.get(floorTimestamp);
    }
}
