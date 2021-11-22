class Solution {
    int[] store;
    int[] array;
    public Solution(int[] nums) {
        store = nums.clone();
        array = nums.clone();
    }
    
    public int[] reset() {
        return store;
    }
    
    public int[] shuffle() {
        int n = array.length;

        for(int i = 0; i < n; i++) {
            int randomNumber = (int)(Math.random() * n);
            int temp = array[i];
            array[i] = array[randomNumber];
            array[randomNumber] = temp;
        }

        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
