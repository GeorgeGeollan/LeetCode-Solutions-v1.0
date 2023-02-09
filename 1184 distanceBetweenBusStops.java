class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int n = distance.length;
        int temp1 = start;
        int temp2 = destination;
        
        while(temp1 != destination) {
            sum += distance[temp1];
            temp1 = (temp1 + 1) % n;
        }

        ans = Math.min(sum, ans);
        sum = 0;

        while(temp2 != start) {
            sum += distance[temp2];
            temp2 = (temp2 + 1) % n;
        }

        ans = Math.min(sum, ans);

        return ans;
    }
}
