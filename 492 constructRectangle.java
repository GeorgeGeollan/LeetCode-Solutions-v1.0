class Solution1 {
    public int[] constructRectangle(int area) {
        int min_len1 = 1, min_len2 = 1;
        int dis = 0, min = area;
        for(int i = 1; i <= area / 2; i++) {
            if(area % i == 0) {
                dis = Math.abs(i - area / i);

                if(min > dis) {
                    min = dis;
                    min_len1 = area / i;
                    min_len2 = i;
                }
            }
        }

        
        return new int[] {min_len1, min_len2};
    }
}

class Solution2 {
    public int[] constructRectangle(int area) {
        for(int i = (int)Math.sqrt(area); ; i--) {
            if(area % i == 0)
                return new int[] {area / i, i};
        }

    }
}
