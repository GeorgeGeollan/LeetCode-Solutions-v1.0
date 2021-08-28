class Solution {
    public int findLUSlength(String[] strs) {
        int res = -1;

        for(int i = 0, j; i < strs.length; i++)
        {
            for(j = 0; j < strs.length; j++)
            {
                if(i == j)
                    continue;

                if(isSubSequence(strs[i], strs[j]))
                    break;
            }
            
            if(j == strs.length)
                res = Math.max(res, strs[i].length());
        }

        return res;
    }

    public boolean isSubSequence(String str1, String str2)
    {
        int i = 0;
        int s1 = str1.length();
        int s2 = str2.length();

        for(int j = 0; j < s2 && i < s1; j++)
        {
            if(str1.charAt(i) == str2.charAt(j))
                i++;
        }

        return i == str1.length();
    }
}
