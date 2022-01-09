class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] dirs = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int x = 0, y = 0, i = 0;

        for(char ins: instructions.toCharArray()) {
            if(ins == 'G') {
                x = dirs[i][0] + x;
                y = dirs[i][1] + y;
            }

            else if(ins == 'L')
                i = (i + 1) % 4;

            else if(ins == 'R')
                i = (i + 4 - 1) % 4;
        }

        return x == 0 && y == 0 || i != 0;    
    }
}
