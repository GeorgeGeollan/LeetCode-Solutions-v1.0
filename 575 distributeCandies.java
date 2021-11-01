class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int need = candyType.length / 2;

        for(int type : candyType) {
            set.add(type);
        }

        int distinct = set.size();

        return Math.min(need, distinct);
    }
}
