class Solution1 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] cpy = new int[n];

        for(int i = 0; i < n; i++) {
            cpy[(i + k) % n] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = cpy[i];
        }
    }
}

class Solution2 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
