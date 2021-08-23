class MedianFinder {
    PriorityQueue<Integer> A;
    PriorityQueue<Integer> B;
    /** initialize your data structure here. */
    public MedianFinder() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>((x, y) -> (y - x));
    }
    
    public void addNum(int num) {
        if(A.size() != B.size())
        {
            A.offer(num);
            B.offer(A.remove());
        }

        else
        {
            B.offer(num);
            A.offer(B.remove());
        }
    }
    
    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (double)(A.peek() + B.peek()) / 2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
