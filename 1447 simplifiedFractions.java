class Solution1 {
    public List<String> simplifiedFractions(int n) {
        HashSet<Double> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for(int j = 1; j < n; j++) {
            for(int i = j + 1; i <= n; i++) {
                int a = j;
                int b = i;
                if(i != 1 && i % j == 0) {
                    b = b / a;
                    a = 1;
                }

                double cur = (double)(a) / b;

                if(!set.contains(cur))
                    list.add("" + a + "/" + b);

                set.add(cur);
            
            }
        }
        

        return list;
    }
}

class Solution2 {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            for(int j = i + 1; j <= n; j++) {
                if(gcd(i, j) == 1)
                    ans.add("" + i + "/" + j);
            }
        }

        return ans;
    }
}
