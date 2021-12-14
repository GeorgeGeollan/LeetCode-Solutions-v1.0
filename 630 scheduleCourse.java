class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        int total = 0;

        for(int[] course: courses) {
            int ti = course[0], di = course[1];

            if(total + ti <= di) {
                total += ti;
                pq.offer(ti);
            }

            else if(!pq.isEmpty() && pq.peek() > ti) {
                total -= pq.poll() - ti;
                pq.offer(ti);
            } 
        }

        return pq.size();
    }
}
