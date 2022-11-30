class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] cnt = new int[2001];
        Set<Integer> set = new HashSet<>();

        for(int num: arr) {
            System.out.println(num + 1000);
            cnt[num + 1000]++;
        }

        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == 0)
                continue;
                
            if(set.contains(cnt[i]))
                return false;

            set.add(cnt[i]);
        }

        return true;
    }
}
