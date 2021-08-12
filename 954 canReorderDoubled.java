class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a: arr)
            map.put(a, map.getOrDefault(a, 0) + 1);

        for(int a: arr)
        {
            if(map.get(a) == 0)
                continue;

            if(a < 0 && a % 2 != 0)
                return false;

            int want = a < 0 ? a / 2 : a * 2;

            if(map.getOrDefault(want, 0) == 0)
                return false;
            
            map.put(a, map.get(a) - 1);
            map.put(want, map.get(want) - 1);
        }

        return true;
    }
}
