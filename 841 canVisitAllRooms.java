class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> unvisited = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        unvisited.push(0);

        while(!unvisited.isEmpty()) {
            int cur = unvisited.pop();
            visited.add(cur);
            List<Integer> curList = rooms.get(cur);
            
            for(int val: curList) {
                if(!visited.contains(val)) {
                    unvisited.push(val);
                }
            }

        }
        
        return visited.size() == rooms.size();
    }
}
