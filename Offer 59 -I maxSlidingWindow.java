## my clumsy solution after doing Offer 59 -II
class Solution1{
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0)
            return new int[0];

        List<Integer> list = new ArrayList<>();
        if(nums.length == 1)
            return new int[]{nums[0]};

        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < k; i++)
        {
            queue.offer(nums[i]);

            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.pollLast();
            
            deque.offerLast(nums[i]);
        }

        for(int i = k; i < nums.length; i++)
        {
            list.add(deque.peekFirst());

            queue.offer(nums[i]);
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.pollLast();
            
            deque.offerLast(nums[i]);
            System.out.println(nums[i]);

            if(queue.peek().equals(deque.peekFirst()))
                deque.pollFirst();
            
            queue.poll();
        }
        list.add(deque.peekFirst());
        int[] arr = new int[list.size()];

        for(int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);

        return arr;
    }
}

class Solution2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0)
            return new int[0];

        Deque<Integer> deque = new LinkedList<>();
        int[] max = new int[nums.length - k + 1];

        for(int i = 0; i < k; i++)
        {
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.pollLast();
            
            deque.addLast(nums[i]);
        }

        max[0] = deque.getFirst();

        for(int i = k; i < nums.length; i++)
        {
            if(deque.getFirst() == nums[i - k])
                deque.pollFirst();
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.pollLast();
            
            deque.addLast(nums[i]);

            max[i - k + 1] = deque.getFirst();
        }

        return max;
    }
}
