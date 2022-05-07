class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0 ; i--) {
            if(nums[i] < k)
                return true;

            while(!deque.isEmpty() && deque.peekLast() < nums[i]) {
                k = Math.max(k, deque.pollLast());
            }

            deque.addLast(nums[i]);
        }

        return false;
    }
}
