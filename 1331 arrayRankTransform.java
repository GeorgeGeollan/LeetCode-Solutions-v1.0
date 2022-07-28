class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        int idx = 1;
        for(int i = 0; i < n; i++) {
            if(i != 0) {
                if(temp[i - 1] != temp[i])
                    idx++;
            }

            map.put(temp[i], idx);
        }

        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
