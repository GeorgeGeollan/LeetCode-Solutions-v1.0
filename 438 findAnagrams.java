class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int[] count = new int[26];

        for(char l: p.toCharArray())
            count[l - 'a']++;

        int a = 0;

        for(int i = 0; i < 26; i++)
            if(count[i] != 0)
                a++;

        int m = s.length(), n = p.length();

        for(int l = 0, r = 0, b = 0; r < m; r++) {
            if(--count[s.charAt(r) - 'a'] == 0)
                b++;

            if(r - l + 1 > n && ++count[s.charAt(l++) - 'a'] == 1)
                b--;

            if(a == b)
                res.add(l);
        }

        return res;
    }
}
