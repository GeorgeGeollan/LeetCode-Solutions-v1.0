class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int task: tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        Iterator<Integer> iterator = map.keySet().iterator();

        while(iterator.hasNext()) {
            Integer key = iterator.next();
            Integer value = map.get(key);
            System.out.println(ans);

            if(value == 1) {
                return -1;
            }

            else if(value % 3 == 0) {
                ans += (value / 3);
            }

            else if(value % 3 == 1) {
                ans += (value / 3 - 1) + 2;
            }

            else if(value % 3 == 2) {
                ans += (value / 3 + 1);
            }
        }

        return ans;
    }
}
