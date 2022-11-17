class Solution1 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        if(ax2 <= bx1 || bx2 <= ax1 || ay2 <= by1 || by2 <= ay1)
            return area1 + area2;

        int cx1 = Math.max(ax1, bx1);
        int cx2 = Math.min(ax2, bx2);

        int cy1 = Math.max(ay1, by1);
        int cy2 = Math.min(ay2, by2);
        int area3 = (cx2 - cx1) * (cy2 - cy1);

        return area1 + area2 - area3;
    }
}

class Solution2 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int x = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int y = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));


        return area1 + area2 - x * y;
    }
}

class Solution3 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int y = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        return (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) - (x * y);
    }
}

