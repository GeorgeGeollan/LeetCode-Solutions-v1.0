class Solution {
    public int[] singleNumber(int[] nums) {
        int sum = 1;
        int k = -1;
        
        for(int num: nums)
            sum ^= num;
        
        for(int i = 31; i >= 0 && k == -1; i--) {
            if(((sum >> i) & 1) == 1)
                k = i;
        }
        
        int[] ans = new int[2];
        for(int num: nums) {
            if(((num >> k) & 1) == 1)
                ans[1] ^= num;
            
            else
                ans[0] ^= num;
        }
        
        return ans;
    }
}
