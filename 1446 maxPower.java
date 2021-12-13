class Solution1 {
    public int maxPower(String s) {
        // s的最小长度为1，所以max的最小值也可以设置为1
        int max = 1;

        int l = 0, n = s.length(), count = 1;

        // 因为涉及到后面有l + 1，所以l < n - 1
        while(l < n - 1) {
            // 若有相等的字符，l右移一位，count + 1
            while(l < n - 1 && s.charAt(l) == s.charAt(l + 1)) {
                count++;
                l++;
            }

            // max和count进行比较取最大值
            max = Math.max(max, count);

            // 重置count
            if(l < n - 1 && s.charAt(l) != s.charAt(l + 1)) {
                l++;
                count = 1;
            }
        }

        return max;
    }
}

class Solution2 {
    public int maxPower(String s) {
        int max = 0;
        
        int n = s.length();
        
        for(int l = 0, r = 0; l < n;) {
            char firstLetter = s.charAt(l);
            char secondLetter = s.charAt(r);
            
            while(firstLetter == secondLetter) {
                r++;
                if(r >= n)
                    break;
                secondLetter = s.charAt(r);
                
            }
            
            max = Math.max(r - l, max);
            
            l++;
            r = l;
        }
        
        return max;
    }
}
