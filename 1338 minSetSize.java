class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int[] flags = new int[map.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            flags[index++] = entry.getValue();
        }
        Arrays.sort(flags);
        int sum = 0;
        int halfLen = length >> 1;
        for (int i = flags.length - 1; i >= 0; i--) {
            sum += flags[i];
            if (sum >= halfLen) {
                return flags.length - i;
            }
        }
        return halfLen;
    }
}
