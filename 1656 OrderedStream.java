class OrderedStream {
    int ptr = 1;
    String[] ans;
    public OrderedStream(int n) {
        ans = new String[n + 1];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> res = new ArrayList<>();
        ans[idKey] = value;

        while(ptr <  ans.length && ans[ptr] != null && ans[ptr].length() > 0) {
            res.add(ans[ptr++]);
        }

        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
