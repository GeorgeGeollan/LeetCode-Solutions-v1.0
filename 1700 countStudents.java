class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt = new int[2];

        for(int stu: students) {
            cnt[stu]++;
        }

        int p = 0;
        while(p < sandwiches.length && (cnt[1] >= 0 && cnt[0] >= 0))
            cnt[sandwiches[p++]]--;

        return cnt[1] == 0 && cnt[0] == 0 ? 0 : sandwiches.length - p + 1;
    }
}
