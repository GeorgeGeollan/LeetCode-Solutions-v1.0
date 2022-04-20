class Solution {
    public int lengthLongestPath(String input) {
        Map<Integer, String> map = new HashMap<>();
        int n = input.length();
        String ans = null;

        for(int i = 0; i < n; ) {
            int level = 0;
            while(i < n && input.charAt(i) == '\t' && ++level >= 0)
                i++;

            int j = i;
            boolean isDir = true;

            while(j < n && input.charAt(j) != '\n')
                if(input.charAt(j++) == '.')
                    isDir = false;

            String cur = input.substring(i, j);
            String prev = map.getOrDefault(level - 1, null);
            String path = prev == null ? cur : prev + "/" + cur;

            if(isDir)
                map.put(level, path);

            else if(ans == null || path.length() > ans.length())
                ans = path;
            
            i = j + 1;
        }

        return ans == null ? 0 : ans.length();
    }
}
