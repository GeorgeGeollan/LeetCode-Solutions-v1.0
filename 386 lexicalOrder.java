class Solution {
    List<Integer> list = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {
        for(int i = 1; i <= 9; i++) {
            if(i > n)
                break;

            list.add(i);
            dfs(i, n);
        }

        return list;
    }

    public void dfs(int i, int n) {
        int num = i * 10;

        for(int j = 0; j <= 9; j++) {
            if(num + j > n)
                break;

            list.add(num + j);
            dfs(num + j, n);
        }
    }
}
