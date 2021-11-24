class Solution {
    static String[] nums = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static int[] priority = new int[] {0, 8, 6, 3, 2, 7, 5, 9, 4, 1};

    public String originalDigits(String s) {
        int[] cnt = new int[26];

        for(char ch: s.toCharArray())
            cnt[ch - 'a']++;

        StringBuilder sb = new StringBuilder();

        for(int p: priority) {
            int k = Integer.MAX_VALUE;
            
            for(char num: nums[p].toCharArray())
                k = Math.min(k, cnt[num - 'a']);

             for(char num: nums[p].toCharArray())
                cnt[num - 'a'] -= k;

            while(k-- > 0)
                sb.append(p);
        }

        char[] cs = sb.toString().toCharArray();
        Arrays.sort(cs);

        return String.valueOf(cs);


    }
}
