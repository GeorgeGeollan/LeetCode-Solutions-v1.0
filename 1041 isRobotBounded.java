class Solution1 {
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

class Solution2 {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0;
        int ptr = 0;

        instructions = instructions + instructions + instructions + instructions;
        for(char ch: instructions.toCharArray()) {
            if(ch == 'L') {
                ptr--;
                continue;
            }

            if(ch == 'R') {
                ptr++;
                continue;
            }

            while(ptr < 0) {
                ptr += 4;
            }

            if(ptr % 4 == 0) {
                y++;
            }

            else if(ptr % 4 == 1) {
                x--;
            }

            else if(ptr % 4 == 2) {
                y--;
            }

            else if(ptr % 4 == 3) {
                x++;
            }

            System.out.println(x + " " + y);
        }

        return x == 0 && y == 0;
    }
}
