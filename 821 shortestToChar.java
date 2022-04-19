class Solution1 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();

        int[] pos = new int[n];

        for(int i = 0; i < n; i++)
            pos[i] = i;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
                list.add(i);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(j == 0)
                    pos[i] = Math.abs(i - list.get(j));
                else    
                    pos[i] = Math.min(pos[i], Math.abs(i - list.get(j)));
            }
        }

        return pos;
    }
}

class Solution2 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();

        int[] ans = new int[n];

        for(int i = 0, idx = -n; i < n; i++) {
            if(s.charAt(i) == c)
                idx = i;

            ans[i] = i - idx;
        }

        for(int i = n - 1, idx = 2 * n; i >= 0; i--) {
            if(s.charAt(i) == c)
                idx = i;

            ans[i] = Math.min(ans[i], idx - i);
        }

        return ans;
    }
}
