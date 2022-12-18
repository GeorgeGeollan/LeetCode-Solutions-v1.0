class Solution1 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        res[n - 1] = 0;

        for(int i = n - 2; i >= 0; i--) {
            if(temperatures[i] < temperatures[i + 1])
                res[i] = 1;
        }

        for(int i = 0; i < n - 1; i++) {
            if(res[i] != 1) {
                int count = 1;
                int idx = i + 1;
                // System.out.println(res[i]);
                while(idx < n && temperatures[i] >= temperatures[idx]) {
                    count++;
                    idx++;
                }

                if(idx == n)
                    res[i] = 0;
                    
                else
                    res[i] = count;
            }
        }
        return res;
    }
}


class Solution2 {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<>();

        for(int i = 0; i < length; i++) {
            int temperature = temperatures[i];

            while(!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                int prevIdx = stack.pop();
                ans[prevIdx] = i - prevIdx;
            }

            stack.push(i);
        }

        return ans;
    }
}
