class Solution1 {
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

class Solution2 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for(int i = 0; i < p.length(); i++)
            cnt1[p.charAt(i) - 'a']++;
        
        for(int l = 0, r = 0; r < s.length(); r++) {
            cnt2[s.charAt(r) - 'a']++;

            if(r - l + 1 > p.length())
                cnt2[s.charAt(l++) - 'a']--;

            if(check(cnt1, cnt2))
                list.add(l);
        }
        

        return list;
    }

    public boolean check(int[] c1, int[] c2) {
        for(int i = 0; i < 26; i++)
            if(c1[i] != c2[i])
                return false;

        return true;
    }
}
