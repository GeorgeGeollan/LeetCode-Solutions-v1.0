class Solution {
    public boolean halvesAreAlike(String s) {
        int l = 0;
        int r = s.length() - 1;

        int n = s.length() - 1;
        int cnt1 = 0;
        int cnt2 = 0;

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');


        while(l < r) {
            if(set.contains(s.charAt(l++)))
                cnt1++;

            if(set.contains(s.charAt(r--)))
                cnt2++;
        }
        
        return cnt1 == cnt2;
        
    }
}
