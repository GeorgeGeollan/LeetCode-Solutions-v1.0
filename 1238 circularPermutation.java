class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < 1 << n; i++) {
            ret.add((i >> 1) ^ i ^ start);
        }

        return ret;
    }
}
