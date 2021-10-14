class Solution1 {
    public int peakIndexInMountainArray(int[] arr) {
        int maxIndex = 0;
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}

class Solution2 {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1;

        while(l < r)
        {
            int mid = l + r >> 1;

            if(arr[mid - 1] > arr[mid])
                r = mid;

            else
                l = mid + 1;
        }

        return r - 1;
    }
}
