class Solution1 {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int num: arr)
        {
            pq.offer(num);

            if(pq.size() > k)
                pq.remove();
        }

        int[] res = new int[k];
        int i = 0;
        while(!pq.isEmpty())
            res[i++] = pq.remove();

        return res;
    }
}

class Solution2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);

        return Arrays.copyOf(arr, k);
    }

    public void quickSort(int[] arr, int l, int r)
    {
        if(l >= r)
            return;

        int i = l, j = r;
        while(i < j)
        {
            while(i < j && arr[j] >= arr[l])
                j--;
            while(i < j && arr[i] <= arr[l])
                i++;

            swap(arr, i, j);
        }

        swap(arr, i, l);

        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
