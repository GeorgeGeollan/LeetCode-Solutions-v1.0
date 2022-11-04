class Solution {
    public int reachNumber(int target) {
        if(target < 0)
            target = -target;

        int k = (int)Math.sqrt(2 * target);
        int dist = (k + 1) * k / 2;

        while(dist < target || (dist - target) % 2 == 1) {
            k++;
            dist = k * (k + 1) / 2;
        }
        
        return k;
    }
}
