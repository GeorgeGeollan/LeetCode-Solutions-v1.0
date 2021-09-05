class Solution {
    int[] nums, temp;
    public int reversePairs(int[] nums) {
        this.nums = nums;

        temp = new int[nums.length];

        return mergeSort(0, nums.length - 1);
    }

    public  int mergeSort(int l, int r)
    {
        if (l >= r) return 0;
        // 递归划分
        int m = (l + r) / 2;
        int res = mergeSort(l, m) + mergeSort(m + 1, r);
        // 合并阶段
        int i = l, j = m + 1;

        for(int k = l; k <= r; k++)
            temp[k] = nums[k];

        for(int k = l; k <= r; k++)
        {
            if(i == m + 1)
                nums[k] = temp[j++];

            if(j == r + 1 || temp[i] <= temp[j])
                nums[k] = temp[i++];

            else
            {
                nums[k] = temp[j++];
                res += m - i + 1;
            }
        }

        return res;
    }
}
