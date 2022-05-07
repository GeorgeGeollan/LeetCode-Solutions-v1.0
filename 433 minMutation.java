class Solution {
    public int minMutation(String start, String end, String[] bank) {
        String[] gen = {"A", "G", "C", "T"};
        Set<String> vis = new HashSet<>();
        Set<String> bankSet = new HashSet<>();
        Deque<String> q = new LinkedList<>();

        for(String b: bank) {
            bankSet.add(b);
        }

        q.offer(start);
        vis.add(start);
        int step = 0;

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                String cur = q.poll();

                if(cur.equals(end))
                    return step;

                for(int j = 0; j < cur.length(); j++) {
                    StringBuilder sb = new StringBuilder(cur);

                    for(int k = 0; k < gen.length; k++) {
                        String replace = sb.replace(j, j + 1, gen[k]).toString();

                        if(!vis.contains(replace) && bankSet.contains(replace)) {
                            q.offer(replace);
                            vis.add(replace);
                        }
                    }
                }
            }

        step++;
        }

    return -1;
    }
}
