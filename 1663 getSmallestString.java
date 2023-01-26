class Solution1 {
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

class Solution2 {
    public String getSmallestString(int n, int k) {
        if(n == 0)
            return "";

        char[] ch = new char[n];

        for(int i = 0; i < n; i++) {
            ch[i] = 'a';
        }

        int rest = k - n;

        if(rest == 0) {
            return new String(ch);
        }

        for(int i = n - 1; i >= 0; i--) {
            if(rest < 26) {
                ch[i] = (char)('a' + rest);

                break;
            }

            else {
                ch[i] = 'z';
                rest -= 25;
            }
        }

        return new String(ch);
    }
}
