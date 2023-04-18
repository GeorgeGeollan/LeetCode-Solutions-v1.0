class BrowserHistory {
    String[] history;
    int cur, range;

    public BrowserHistory(String homepage) {
        history = new String[5000];
        cur = -1;
        this.visit(homepage);
    }
    
    public void visit(String url) {
        history[++cur] = url;
        range = cur;
    }
    
    public String back(int steps) {
        cur = Math.max(0, cur - steps);
        return history[cur];
    }
    
    public String forward(int steps) {
        cur = Math.min(cur + steps, range);
        return history[cur];
    }
}
