class Solution1 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        for(int i = 0; i < rowIndex + 1; i++) {
            cur = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    cur.add(1);

                else
                    cur.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));


                System.out.println(cur);
            }

            ans.add(cur);
        }

        return cur;
    }
}

class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for(int i = 1; i < rowIndex + 1; i++) {
            row.add(0);

            for(int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}
