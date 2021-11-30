class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if(n == 0)
            return 0;

        if(n == 1)
            return heights[0];
        
        int res = 0;
        int[] newHeights = new int[n + 2];
        newHeights[0] = 0;
        newHeights[n + 1] = 0;

        for(int i = 1; i < n + 1; i++)
            newHeights[i] = heights[i - 1];

        heights = newHeights;
        n = heights.length;

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addLast(0);

        for(int i = 1; i < n; i++) {
            while(heights[i] < heights[deque.peekLast()]) {
                int curHeight = heights[deque.pollLast()];
                int curWidth = i - deque.peekLast() - 1;
                res = Math.max(res, curHeight * curWidth);
            }

            deque.addLast(i);
        }

        return res;
    }
}
