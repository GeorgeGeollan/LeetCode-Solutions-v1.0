class UndergroundSystem {
    Map<Integer, Pair<String, Integer>> mapIn = new HashMap<>();
    Map<String, int[]> mapOut = new HashMap<>();
    
    
    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        mapIn.put(id, new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        String keyStation = mapIn.get(id).getKey() + "-" + stationName;
        int timeCost =  t - mapIn.get(id).getValue();
        
        int cnt = mapOut.getOrDefault(keyStation, new int[]{0, 0})[1] + 1;
        int time = mapOut.getOrDefault(keyStation, new int[]{0, 0})[0] + timeCost;
        mapOut.put(keyStation, new int[]{time, cnt});
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String keyStation = startStation + "-" + endStation;
        int[] data = mapOut.get(keyStation);
        
        return (double)(data[0]) / data[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
