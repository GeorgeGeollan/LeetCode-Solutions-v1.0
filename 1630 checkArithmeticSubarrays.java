class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> ans = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(arr);
            ans.add(isArithmeticSubarrays(arr));
        }

        return ans;
    }

    public boolean isArithmeticSubarrays(int[] arr) {
        if(arr.length == 2) {
            return true;
        }

        int len = arr.length;
        if((arr[len - 1] - arr[0]) % (len - 1) != 0) {
            return false;
        }

        for(int i = 2; i < len; i++) {
            if(arr[i] - arr[i - 1] != arr[1] - arr[0]) {
                return false;
            }
        }

        return true; 
    }
}
