class Solution {
    public String addBinary(String a, String b) {
        int impr = 0;
        StringBuilder ans = new StringBuilder();
        
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int b1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int b2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int cur = (b1 + b2 + impr) % 2;
            impr = (b1 + b2 + impr) / 2;
            ans.append(cur);
        }
        
        ans.append(impr == 1 ? impr : "");
        
        return ans.reverse().toString();
    }
}
