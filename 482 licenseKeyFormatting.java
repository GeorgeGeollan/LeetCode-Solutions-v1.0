class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();

        for(int i = s.length() - 1, cnt = 0; i >= 0; i--)
        {
            if(ch[i] == '-')
                continue;

            else if(cnt == k && (cnt = 0) >= 0)
                sb.append("-");
            
            cnt++;
            
            sb.append(ch[i]);
        }

        return sb.reverse().toString().toUpperCase();
    }
}
