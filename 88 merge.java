class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int tail = m + n - 1;
        int cur;

        while(ptr1 >= 0 || ptr2 >= 0) {
            if(ptr1 == -1)
                cur = nums2[ptr2--];

            else if(ptr2 == -1)
                cur = nums1[ptr1--];

            else if(nums1[ptr1] >= nums2[ptr2])
                cur = nums1[ptr1--];

            else
                cur = nums2[ptr2--];

            nums1[tail--] = cur;
        }
    }
}
