class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0)
            return new int[0];

        HashSet<Integer>[] set = new HashSet[numCourses];
        int[] inDegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++)
            set[i] = new HashSet<>();

        for(int[] prerequisite: prerequisites) {
            set[prerequisite[1]].add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0)
                queue.add(i);
        }

        int[] res = new int[numCourses];
        int count = 0;

        while(!queue.isEmpty()) {
            Integer head = queue.poll();
            res[count++] = head;

            HashSet<Integer> courses = set[head];

            for(Integer course: courses) {
                inDegree[course]--;

                if(inDegree[course] == 0)
                    queue.add(course);
            }
        }

        if(count == numCourses)
            return res;

        return new int[0];
    }
}
