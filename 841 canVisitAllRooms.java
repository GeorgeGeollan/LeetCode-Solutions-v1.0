class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        HashSet<Integer> set = new HashSet<>();
        set.add(0);

        while(!stack.isEmpty())
        {
            int i = stack.pop();

            for(int j: rooms.get(i))
            {
                if(!set.contains(j))
                {
                    stack.push(j);
                    set.add(j);

                     if(set.size() == rooms.size())
                        return true;
                }
            }
        }

        return rooms.size() == set.size();
    }
}
