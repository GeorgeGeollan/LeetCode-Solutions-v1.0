class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int[] ans = new int[n + 1];
        int last = n;
        int first = 0;
        
        for(int i = 0; i < n; i++) {
            if(ch[i] == 'D')
                ans[i] = last--;

            if(ch[i] == 'I')
                ans[i] = first++;
        }

        ans[n] = first;

        return ans;
        
    }
}
