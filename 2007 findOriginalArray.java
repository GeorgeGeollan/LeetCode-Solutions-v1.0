class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        Queue<Integer> queue = new LinkedList<>();
        int n = changed.length;


        if(n % 2 == 1)
            return new int[0];

        int[] original = new int[n / 2];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(queue.isEmpty()) {
                queue.add(changed[i]);
            }

            else {
                if(queue.peek() * 2 == changed[i]) {
                    original[cnt++] = queue.remove();
                }

                else
                    queue.add(changed[i]);
            }
        }

        if(!queue.isEmpty())
            return new int[0];

        return original;

    }
}
