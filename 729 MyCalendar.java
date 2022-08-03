class MyCalendar {
    List<int[]> list = new ArrayList<>();
    
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        end--;
        for(int[] info: list) {
            if(start > info[1] || end < info[0])
                continue;
            
            return false;
        }
        
        list.add(new int[] {start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
