class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preSumFreq = new HashMap<>();
        
        preSumFreq.put(0, 1);
        
        int preSum = 0;
        int cnt = 0;
        
        for(int num: nums) {
            preSum += num;
            
            if(preSumFreq.containsKey(preSum - k))
                cnt += preSumFreq.get(preSum - k);
            
            preSumFreq.put(preSum, preSumFreq.getOrDefault(preSum, 0) + 1);
        }
        
        return cnt;
    }
}
