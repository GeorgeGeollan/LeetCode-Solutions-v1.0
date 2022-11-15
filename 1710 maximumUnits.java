class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> (b[1]) - a[1]);
        int ans = 0;
        int size = 0;

        for(int[] box: boxTypes) {
            if(size + box[0] <= truckSize) {
                size = size + box[0];
                ans = ans + box[1] * box[0];
            }

            else if(size + box[0] > truckSize ) {
                int remain = truckSize - size;

                if(remain > 0)
                    ans = ans + remain * box[1];

                break;
            }

        
        }

        return ans;
    }
}
