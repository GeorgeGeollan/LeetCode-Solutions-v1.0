class Solution {
    public int[][] findContinuousSequence(int target) {
        int l = 1, r = 1, sum = 0;
        List<int[]> res = new ArrayList<>();

        while(l <= target / 2)
        {
            if(sum < target)
                sum += r++;

            else if(sum > target)
                sum -= l++;

            else
            {
                int[] arr = new int[r - l];

                for(int i = 0; i < arr.length; i++)
                    arr[i] = i + l;

                res.add(arr);

                sum -= l++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
