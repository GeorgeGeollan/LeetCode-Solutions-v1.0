class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if(numRows >= 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            ans.add(list);
        }

        if(numRows >= 2) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            ans.add(list);
        }

        for(int i = 3; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            
            List<Integer> prev = ans.get(i - 2);

            for(int j = 1; j < prev.size(); j++) {
                list.add(prev.get(j - 1) + prev.get(j));
            }

            list.add(1);

            ans.add(list);
        }

        return ans;
    }
}
