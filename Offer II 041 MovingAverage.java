class MovingAverage {
    double sum = 0;
    int cnt = 0;
    int size;
    Deque<Integer> deque;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        deque = new ArrayDeque();
    }
    
    public double next(int val) {
        if(deque.size() < size) {
            cnt++;
            sum += val;
            deque.addLast(val);
        }

        else {
            sum -= deque.pollFirst();
            sum += val;
            deque.addLast(val);
        }

        return sum / cnt;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
