class Solution1 {
    public boolean validTicTacToe(String[] board) {
        int count_o = 0;
        int count_x = 0;
        boolean connect_o = false;
        boolean connect_x = false;

        for(String line: board) {
            if(line.equals("XXX"))
                connect_x = true;
            if(line.equals("OOO"))
                connect_o = true;
            for(char ch: line.toCharArray()) {
                if(ch == 'O')
                    count_o++;
                if(ch == 'X')
                    count_x++;
            }
        }

        char[][] chess = new char[3][3];
        for(int i = 0; i < 3; i++)
            chess[i] = board[i].toCharArray();

        for(int j = 0; j < 3; j++) {
            String cur = "";
            for(int i = 0; i < 3; i++)
                cur += String.valueOf(chess[i][j]);

            if(cur.equals("OOO"))
                connect_o = true;

            if(cur.equals("XXX"))
                connect_x = true;
        }

        String l1 = "";
        for(int i = 0; i < 3; i++)
            l1 += String.valueOf(chess[i][i]);

        if(l1.equals("OOO"))
            connect_o = true;

        if(l1.equals("XXX"))
            connect_x = true;

        String l2 = "";
        for(int i = 2; i >= 0; i--)
            l2 += String.valueOf(chess[i][2 - i]);
        
        if(l2.equals("OOO"))
            connect_o = true;

        if(l2.equals("XXX"))
            connect_x = true;

        int stat_num = count_x - count_o;

        return (stat_num == 0 && ((connect_x == false && connect_o == false) || (connect_o == true && connect_x == false)))
               || (stat_num == 1 && ((connect_x == true && connect_o == false) || (connect_x == false && connect_o == false)));
        
    }
}

class Solution2 {
    public boolean validTicTacToe(String[] board) {
        char[][] chess = new char[3][3];
        int o = 0, x = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                char c = board[i].charAt(j);

                if(c == 'X')
                    x++;
                
                else if(c == 'O')
                    o++;

                chess[i][j] = c;
            }
        }

        boolean a = check(chess, 'X'), b = check(chess, 'O');
        if(o - x > 0 || x - o > 1)
            return false;

        if(a && x <= o)
            return false;

        if(b && o != x)
            return false;

        if(a && b)
            return false;

        return true;
    }

    public boolean check(char[][] chess, char c) {
        for(int i = 0;i < 3; i++) {
            if(chess[i][0] == c && chess[i][1] == c && chess[i][2] == c)
                return true;

            if(chess[0][i] == c && chess[1][i] == c && chess[2][i] == c)
                return true;
        }

        boolean a = true, b = true;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == j)
                    a &= chess[i][j] == c;
                
                if(i + j == 2)
                    b &= chess[i][j] == c;
            }
        }

        return a || b;
    }
}
