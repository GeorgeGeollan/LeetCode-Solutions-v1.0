class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int asteroid: asteroids) {
            boolean ok = true;
            while(ok && !stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int a = stack.peek(), b = -asteroid;

                if(a <= b)
                    stack.pop();

                if(a >= b)
                    ok = false;
            }

            if(ok)
                stack.push(asteroid);
        }

        int len = stack.size();

        int[] ans = new int[len];

        for(int i = len - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
