class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] rest = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            rest[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(rest);

        for(int i = 0; i < n; i++) {
            if(rest[i] == 0) {
                cnt++;
                continue;
            }

            else {
                if(rest[i] > additionalRocks) {
                    break;
                }

                else {
                    additionalRocks -= rest[i];
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
