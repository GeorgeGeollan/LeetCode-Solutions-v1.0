class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length -1);
    }

    public void quickSort(int[] nums, int p, int r) {
        if(p >= r) {
            return;
        }

        int q = paritition(nums, p, r);
        quickSort(nums, p, q - 1);
        quickSort(nums, q + 1, r);
    }

    public int paritition(int[] nums, int p, int r) {
        int i = p;
        int pivot = nums[r];

        for(int j = p; j <= r - 1; j++) {
            if(nums[j] < pivot) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[r];
        nums[r] = temp;

        return i;
    }
}
