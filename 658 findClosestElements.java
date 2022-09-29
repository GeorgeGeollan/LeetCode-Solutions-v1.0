class Solution1 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int right = binarySearch(arr, x);
        int left = right - 1;

        while(k-- > 0) {
            if(left < 0)
                right++;

            else if(right >= arr.length)
                left--;

            else if(x - arr[left] <= arr[right] - x)
                left--;
            
            else
                right++;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = left + 1; i < right; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }

    public int binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

class Solution2 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        int min = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = k; i < len; i++, min++) {
            if(arr[i] != arr[min] && Math.abs(arr[i] - x) >= Math.abs(arr[min] - x))
                break;
        }
        
        for(int i = 0; i < k; i++)
            list.add(arr[min++]);
        
        return list;
    }
}

