class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        
        int total = n;
        int tmp = 0;
        while(n > 0) {
            if(n == 1)
                sb.insert(tmp, (char)('a' + k - 1));

            else if((n - 1) * 26 >= k) {
                 sb.append("a");
                 k = k - 1;
                 tmp = total - n + 1;
            }
               

            else if((n - 1) * 26 < k && n * 26 >= k){
                sb.insert(sb.length(), 'z');
                k = k - 26;
            }
          
            n--;
        }

        return sb.toString();
    }
}
