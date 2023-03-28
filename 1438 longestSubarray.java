class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length, ans = 0;
        Deque<Integer> max = new ArrayDeque<>(), min = new ArrayDeque<>();

        for(int l = 0, r = 0; r < n; r++) {
            while(!max.isEmpty() && nums[r] >= nums[max.peekLast()]) {
                max.pollLast();
            }
                
            max.addLast(r);

            while(!min.isEmpty() && nums[r] <= nums[min.peekLast()]) {
                min.pollLast();
            }
                
            min.addLast(r);

            while(Math.abs(nums[max.peekFirst()] - nums[min.peekFirst()])> limit) {
                l++;

                if(l > max.peekFirst()) {
                    max.pollFirst();
                }
                    

                if(l > min.peekFirst()) {
                    min.pollFirst();
                }
                    
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
