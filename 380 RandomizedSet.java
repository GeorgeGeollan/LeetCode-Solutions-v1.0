class RandomizedSet1 {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    Random rand = new Random();

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;

        map.put(val, list.size());
        list.add(list.size(), val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;

        int lastElement = list.get(list.size() - 1);
        int idx = map.get(val);
        list.set(idx, lastElement);
        map.put(lastElement, idx);
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

class RandomizedSet2 {
    static int[] nums = new int[200010];
    Random random = new Random();
    Map<Integer, Integer> map = new HashMap<>();
    int idx = -1;

    public RandomizedSet() {

    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;

        nums[++idx] = val;
        map.put(val, idx);

        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;

        int loc = map.remove(val);
        if(loc != idx)
            map.put(nums[idx], loc);
        nums[loc] = nums[idx--];
        return true;
    }
    
    public int getRandom() {
        return nums[random.nextInt(idx + 1)];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
