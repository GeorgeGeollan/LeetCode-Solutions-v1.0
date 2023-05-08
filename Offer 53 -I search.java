class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length;

        while(l < r) {
            int mid = (l + r) / 2;

            if(nums[mid] == target) {
                int ml = mid - 1, mr = mid + 1;

                while(ml >= l && nums[ml] == target) {
                    ml--;
                }

                while(mr < r && nums[mr] == target) {
                    mr++;
                }

                return mr - ml - 1;
            }

            else if(nums[mid] > target) {
                r = mid;
            }

            else {
                l = mid + 1;
            }
        }

        return 0;
    }
}
